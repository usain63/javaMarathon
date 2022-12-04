package day11.task1;

public class Picker implements Worker{
  private double salary;
  private final double payment;
  private boolean isPayed = false;
  private double totalBonus;
  private final double bonus;
  public double personalOrders;
  Warehouse wh;

  public Picker(Warehouse warehouse) {
    this.wh = warehouse;
    payment = 80;
    bonus = 70000;
  }

  public double getTotalBonus() {
    return totalBonus;
  }

  public double getBonus() {
    return bonus;
  }

  public double getSalary() {
    return salary;
  }

  public boolean isPayed() {
    return isPayed;
  }
  
  public String toString(){
    if (isPayed)
      return "Выплаченная ЗП: " + salary + "\nРазмер бонуса: " + totalBonus;
    else
      return "Выплаченная ЗП: " + salary + "\nБонус еще не выплачивался";
      
  }

  @Override
  public void doWork() {
    salary+=payment;
    wh.addOnePickedOrder();
    personalOrders++;
  }

  @Override
  public void bonus() {
    if (isPayed)
      System.out.println("Бонус уже был выплачен");
    else
    {
      if (wh.getCountPickedOrders() >= Warehouse.PLAN){ 
        if (personalOrders >= Warehouse.PLAN){
          totalBonus += bonus;
        }
        else
          totalBonus += ( personalOrders / Warehouse.PLAN) * bonus;
        isPayed = true;
      } else
        System.out.println("Бонус пока недоступен"); 
    }
  }
}

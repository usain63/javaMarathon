package day11.task1;

public class Picker implements Worker{
  public double salary;
  public boolean isPayed = false;
  public double totalBonus;
  public double personalOrders;
  Warehouse wh;

  public Picker(Warehouse warehouse) {
    this.wh = warehouse;
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
    salary+=80;
    wh.countPickedOrders++;
    personalOrders++;
  }

  @Override
  public void bonus() {
    if (isPayed)
      System.out.println("Бонус уже был выплачен");
    else
    {
      if (wh.countPickedOrders >= 10000){ 
        if (personalOrders >= 10000){
          totalBonus += 70000;
        }
        else
          totalBonus += ( personalOrders / 10000) * 70000;
        isPayed = true;
      } else
        System.out.println("Бонус пока недоступен"); 
    }
  }
}

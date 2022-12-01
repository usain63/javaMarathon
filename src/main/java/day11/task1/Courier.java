package day11.task1;

public class Courier implements Worker{
  public double salary;
  public boolean isPayed = false;
  public double totalBonus;
  public double personalOrders;
  Warehouse wh;

  public double getSalary() {
    return salary;
  }

  public boolean isPayed() {
    return isPayed;
  }

  public Courier(Warehouse warehouse) {
    this.wh = warehouse;
  }

  public String toString(){
    if (isPayed)
      return "Выплаченная ЗП: " + salary + "\nРазмер бонуса: " + totalBonus;
    else
      return "Выплаченная ЗП: " + salary + "\nБонус еще не выплачивался";

  }

  @Override
  public void doWork() {
    salary+=100;
    wh.countDeliveredOrders++;
    personalOrders++;
  }

  @Override
  public void bonus() {
    if (isPayed)
      System.out.println("Бонус уже был выплачен"); // бонус уже выплачивали
    else
    {
      if (wh.countDeliveredOrders >= 10000){ // Проверка плана по складу
        if (personalOrders >= 10000){// Проверка плана по сотруднику
          totalBonus += 50000;
        }else 
          totalBonus += ( personalOrders / 10000) * 50000; // Начисление бонусов в пропорции от личного плана
        isPayed = true;
      } else
        System.out.println("Бонус пока недоступен"); // общее количество заказов на складе меньше 100000
    }
  }
}

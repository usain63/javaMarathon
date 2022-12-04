package day11.task1;

public class Courier implements Worker {
  private double salary;
  private final double payment;
  private boolean isPayed = false;
  private double totalBonus;
  private final double bonus;
  private double personalOrders;
  Warehouse wh;

  public double getSalary() {
    return salary;
  }

  public boolean isPayed() {
    return isPayed;
  }

  public double getTotalBonus() {
    return totalBonus;
  }

  public double getPersonalOrders() {
    return personalOrders;
  }

  public Courier(Warehouse warehouse) {
    this.wh = warehouse;
    payment = 100;
    bonus = 50000;
  }

  public String toString() {
    if (isPayed)
      return "Выплаченная ЗП: " + salary + "\nРазмер бонуса: " + totalBonus;
    else
      return "Выплаченная ЗП: " + salary + "\nБонус еще не выплачивался";
  }

  @Override
  public void doWork() {
    salary += payment;
    wh.addOneDeliveredOrder();
    personalOrders++;
  }

  @Override
  public void bonus() {
    if (isPayed)
      System.out.println("Бонус уже был выплачен"); // бонус уже выплачивали
    else {
      if (wh.getCountDeliveredOrders() >= Warehouse.PLAN) { // Проверка плана по складу
        if (personalOrders >= Warehouse.PLAN) {// Проверка плана по сотруднику
          totalBonus += bonus;
        } else
          totalBonus += (personalOrders / Warehouse.PLAN) * bonus; // Начисление бонусов в пропорции от личного плана
        isPayed = true;
      } else
        System.out.println("Бонус пока недоступен"); // общее количество заказов на складе меньше 100000
    }
  }
} 

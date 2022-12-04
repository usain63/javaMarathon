package day11.task1;

public class Warehouse {
  private int countPickedOrders;
  private int countDeliveredOrders;
  public final static int PLAN = 10000;

  public int getCountPickedOrders() {
    return countPickedOrders;
  }

  public int getCountDeliveredOrders() {
    return countDeliveredOrders;
  }
  
  public void addOnePickedOrder() {
    countPickedOrders++;
  }
  
  public void addOneDeliveredOrder() {
    countDeliveredOrders++;
  }
  
  public String toString() {
    return "Заказов собрано: " + countPickedOrders + "\n" + "Заказов доставлено: " + countDeliveredOrders;
  }
}

package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse();
        
        Picker picker = new Picker(wh);
        Courier courier = new Courier(wh);
        
        businessProcess(picker);
        businessProcess(courier);

        System.out.println("Собрано заказов: " + wh.getCountPickedOrders());
        System.out.println("Доставлено заказов: " + wh.getCountDeliveredOrders());

        System.out.println("ЗП первого сборщика: " + picker.getSalary());
        System.out.println("ЗП первого курьера: " + courier.getSalary());

        System.out.println("Бонусы первого сбощика: " + picker.totalBonus);
        System.out.println("Бонусы первого курьера: " + courier.totalBonus);
        
        picker.bonus(); // повторный бонус сборщика
        picker.bonus(); // повторный бонус курьера
        System.out.println("----------//----------");
        
        Warehouse wh1 = new Warehouse();
        Picker picker1 = new Picker(wh1);
        Courier courier1 = new Courier(wh1);

        picker1.doWork();
        courier1.doWork();

        System.out.println("Собрано заказов: " + wh.getCountPickedOrders());
        System.out.println("Доставлено заказов: " + wh.getCountDeliveredOrders());

        System.out.println("ЗП сборщика: " + picker.getSalary());
        System.out.println("ЗП курьера: " + courier.getSalary());

        System.out.println("Бонусы первого сбощика: " + picker.totalBonus);
        System.out.println("Бонусы курьера: " + courier.totalBonus);
       
    } 
    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++)
            worker.doWork();
        worker.bonus();
    }
}

package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane myPlane = new Airplane("Boeing", 2005, 90, 300);
        myPlane.info();
        
        myPlane.setYear(2007);
        myPlane.setLength(91);
        myPlane.fillUp(500);
        myPlane.fillUp(100);
        
        myPlane.info();

    }
}

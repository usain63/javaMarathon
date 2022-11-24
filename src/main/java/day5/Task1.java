package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.setModel("G55");
        myCar.setColour("Grey");
        myCar.setYear(2012);

        System.out.println("Model is " + myCar.getModel());
        System.out.println("Colour is " + myCar.getColour());
        System.out.println("Year of manufacture is " + myCar.getYear());
    }
}

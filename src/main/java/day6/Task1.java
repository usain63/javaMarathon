package day6;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("G55");
        myCar.setColour("Grey");
        myCar.setYear(2011);

        Motorcycle myMoto = new Motorcycle("Harley Fatboy", "Grey", 2010);
        
        myCar.info();
        System.out.println(myCar.yearDifference(2000));

        myMoto.info();
        System.out.println(myMoto.yearDifference(2001));
    }
}

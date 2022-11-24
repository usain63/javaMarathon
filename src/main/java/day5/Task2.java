package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorcycle myMoto = new Motorcycle ("Harley Davidson Fat Boy", "Black", 2010);

        System.out.println("Model is " + myMoto.getModel());
        System.out.println("Colour is " + myMoto.getColour());
        System.out.println("Year of manufacture is " + myMoto.getYear());
    
    }
}

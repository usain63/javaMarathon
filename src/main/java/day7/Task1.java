package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing", 2005, 70, 500);
        Airplane sukhoi = new Airplane("Sukhoi", 2015, 90, 600);
        
        Airplane.compareAirplanes(boeing, sukhoi);
    }
}

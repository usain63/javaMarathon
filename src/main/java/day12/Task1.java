package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Range rover");
        cars.add("Jeep");
        cars.add("Toyota");
        cars.add("Hammer");
        System.out.println(cars);
        
        cars.add(3, "BMW");
        cars.remove(0);
        System.out.println(cars);

    }
}

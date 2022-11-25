package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введдите делимое: ");
            Scanner scanner1 = new Scanner(System.in);
            double devidend = scanner1.nextDouble();

            System.out.print("Введдите делитель: ");
            double devider = scanner1.nextDouble();
            
            if (devider == 0) {
                break;
            }
            System.out.println(devidend / devider);
        }
    }
}

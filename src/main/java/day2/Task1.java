package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
            int floorNumber = new Scanner(System.in).nextInt();

            if (floorNumber >= 1 && floorNumber < 5) {
                System.out.println("Малоэтажный дом");
            } else if (floorNumber >= 5 && floorNumber < 9) {
                System.out.println("Среднеэтажный дом");
            } else if (floorNumber >= 9) {
                System.out.println("Многоэтажный дом");
            } else if (floorNumber <= 0) {
                System.out.println("Ошибка ввода");
            }
    }
}

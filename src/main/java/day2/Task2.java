package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int i = a +1; i < b; i++ ){
                if (i % 5 == 0 && !(i % 10==0)) {
                    System.out.println(i);
                }
            }
        }
    }
}

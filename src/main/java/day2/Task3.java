package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int i = a + 1;
        
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else{
            while (i < b){
                if (i % 5 == 0 && !(i % 10==0)) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}

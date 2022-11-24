package day4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int aboveEight = 0;
        int equalToOne = 0;
        int devByTwo = 0;
        int nonDevByTwo = 0;
        int totalSum = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        
        int[] myArray = new int[n];
        Random item = new Random();
        for (int i = 0; i < n; i++) {
            myArray[i] = item.nextInt(11);
        }
        System.out.println("Инициализирован массив: " + Arrays.toString(myArray));
        System.out.println("Содержимое массива: ");
        for (int arrItem:myArray) {
            System.out.println(arrItem);
            totalSum += arrItem;
            
            if (arrItem > 8) 
                aboveEight++;
            else if (arrItem == 1)
                equalToOne++;
            else if (arrItem % 2 == 0)
                devByTwo++;
            else if (arrItem % 2 != 0)
                nonDevByTwo++;
        }
        System.out.println("Количество чисел больше 8: " + aboveEight);
        System.out.println("Количество чисел равных 1: " + equalToOne);
        System.out.println("Количество четных чисел: " + devByTwo);
        System.out.println("Количество неченых чисел: " + nonDevByTwo);
        System.out.println("Сумма всех элементов массива: " + totalSum);
    }
}

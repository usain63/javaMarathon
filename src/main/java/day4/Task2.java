package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] array1 = new int[100];
        Random randInt = new Random();
        
        for (int i = 0; i < 100; i++) {
            array1[i] = randInt.nextInt(10001);
        }
        
        int max = array1[0];
        int min = array1[0];
        int countZero = 0;
        int zeroSum = 0;
        
        System.out.println("Наш массив: " + Arrays.toString(array1));

        for (int item: array1) {
            if (item > max)
                max = item;
            else if (item < min)
                min = item;
            else if (item % 10 == 0) {
                countZero++;
                zeroSum += item;
            }
        }
        System.out.println("Наиболший элемент массива = " + max);
        System.out.println("Наименьший элемент массива = " + min);
        System.out.println("Количество элементов с 0 на конце = " + countZero);
        System.out.println("Сумма элементов с нулем на конце = " + zeroSum);
    }
}

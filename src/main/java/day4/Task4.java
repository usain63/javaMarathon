package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int n = 100;
        Random anyInt = new Random();
        int[] myArray = new int[n];
        
        int maxSum = 0;
        int coreIndex = 0;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            myArray[i] = anyInt.nextInt(10000);
        }
        System.out.println("Наш массив " + Arrays.toString(myArray));
        
        for (int i =0; i < (n - 2); i++) {
            
            for (int j = i; j < i +3; j++)
                currentSum += myArray[j];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
                coreIndex = i;
            }
        }
        System.out.println("Максимальная сумма : " + maxSum);
        System.out.println("Первый индекс в максимальной тройке: " + coreIndex);
    }
}

package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        
        int s = 12;
        int c = 8;
        Random randomInt = new Random();
        int lineIndex = 0;
        int lineSum = 0;
        int lineSumCurrent = 0;
        
        int [][] twoDimArr = new int[s][c];
        for (int i = 0; i < s; i++){
            for (int j = 0; j < c; j++) {
                twoDimArr[i][j] = randomInt.nextInt(51);
            }
        }
        System.out.println("Наш массив: ");
        for (int[] list: twoDimArr) {
            System.out.println(Arrays.toString(list));
        }

        for (int i = 0; i < s; i++) {
           // int lineSumCurrent = 0;
            for (int j = 0; j < c; j++) {
                lineSumCurrent += twoDimArr[i][j];
            }
            if (lineSumCurrent >= lineSum) {
                lineIndex = i;
                lineSum = lineSumCurrent;
                lineSumCurrent = 0;
            }
        }
        System.out.println("Индекс строки, сумма в которой максимальна: " + lineIndex);
        System.out.println("Сумма значений строки: " + lineSum);
    }
}

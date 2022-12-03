package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File day14 = new File("day14.txt");
        File file = new File("asc.txt");
        
        printSumDigits(file);
        printSumDigits(day14);
    }
    
    public static void printSumDigits (File file)  {
        try {
            int totalSum = 0;
            Scanner scanner = new Scanner(file);
            String stringNumbers = scanner.nextLine();
            String[] strNumbersArray = stringNumbers.split(" ");
            
            if (strNumbersArray.length != 10)
                throw new Exception();
            
            for (int i = 0; i < strNumbersArray.length; i++)
                totalSum += Integer.parseInt(strNumbersArray[i]);

            System.out.println(totalSum);
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Некорректный входной файл " + e.getMessage());
        }
    }
}

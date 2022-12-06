package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14.txt");
        printResult(file);

    }
    
    public static void printResult(File file){
        
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            double average = 0;
            
            String line = scanner.nextLine();
            String[] arrayFromLine = line.split(" ");
            for (String number: arrayFromLine) {
                sum += Double.parseDouble(number);
            }
            
            average = sum / arrayFromLine.length;
            System.out.print(average + " --> " + String.format("%.3f", average));
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}


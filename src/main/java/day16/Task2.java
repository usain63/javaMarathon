package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        
        saveToFile1(file1);
        saveToFile2(file1, file2);
        printResult(file2);
    }

    public static void saveToFile1(File file) {
        Random random = new Random();
        
        try {
            PrintWriter pw = new PrintWriter(file);
            for (int i = 0; i < 1000; i++)
                pw.print(random.nextInt(101) + " ");
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
    
    public static void saveToFile2 (File file1, File file2) {
        
        int segmentSize = 20;
        int sumOfASegment = 0;
        double avgOfASegment = 0;
       
        try {
            
            Scanner scanner = new Scanner(file1);
            PrintWriter pw = new PrintWriter(file2);
            
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arrFromLine = line.split(" ");
                String[] subArrFromLine = new String[segmentSize];
                
                
                for (int i = 0; i < arrFromLine.length - 19; i += segmentSize){
                    subArrFromLine = Arrays.copyOfRange(arrFromLine, i, i + segmentSize);
                    
                    for (int j = 0; j < subArrFromLine.length; j++){
                        sumOfASegment += Integer.parseInt(subArrFromLine[j]);
                    }
                    pw.print(((double) sumOfASegment / segmentSize) + " ");
                    sumOfASegment = 0;
                }
            }
            scanner.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
    
    public static void printResult(File file) {
        int finalSum = 0;
        
        try {
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] arrFromLine = line.split(" ");

                for (String num:arrFromLine) {
                    finalSum += Double.parseDouble(num);
                }
                System.out.println(finalSum);
            }
                
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}

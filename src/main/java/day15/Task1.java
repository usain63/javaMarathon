package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File shoesFile = new File("/Users/18882337/IdeaProjects/JavaMarathon2021/src/main/resources/shoes.csv");
        parseShoes(shoesFile);
    }

    public static void parseShoes(File file) {
        String[] lineArray = new String[3];
        List<String> missedShoes = new ArrayList<>();
        
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String lineOut = scanner.nextLine();
                lineArray = lineOut.split(";");
                
                if (Integer.parseInt(lineArray[2]) == 0)
                    missedShoes.add(lineOut.replace(";", ","));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Входной файл не найден");;
        } catch (ArrayIndexOutOfBoundsException arrE) {
            System.out.println("Формат входной файла отличается от ожидаемого: " + arrE.getMessage());
            missedShoes = null;
        }
        
        File missingShoesFile = new File("/Users/18882337/IdeaProjects/JavaMarathon2021/src/main/resources/missing_shoes.txt");
        
        try {
            PrintWriter pw = new PrintWriter(missingShoesFile);
            for (String shoe: missedShoes) {
                pw.println(shoe);
            }
          pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл для записи");
        } catch (NullPointerException npe) {
            System.out.println("Входной файл некорректен, поэтому и записывать нечего");
        }
    }
}

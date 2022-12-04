package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File peopleFile = new File("people.txt");

        System.out.println(parseFileToStringList(peopleFile));

    }
    
    public static List<String> parseFileToStringList (File file) {
        List<String> peoples = new ArrayList<>();
        String [] devidedLine = new String[3];

        try {
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                devidedLine = line.split(" ");
                if (Integer.parseInt(devidedLine[1]) >= 0) 
                    peoples.add(line);
                else
                    throw new IOException("Некорректный входной файл");
            }
            scanner.close();
                    
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            peoples = null;
        }
        return peoples;
    }
}

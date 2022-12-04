package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }
    
    public static List<Person> parseFileToObjList(File file) {
        List<Person> persons = new ArrayList<>();
        String [] devidedLine = new String[2];

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                devidedLine = line.split(" ");
                if (Integer.parseInt(devidedLine[1]) >= 0) {
                    persons.add(new Person(devidedLine[0], Integer.parseInt(devidedLine[1])));
                }
                else
                    throw new IOException();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            persons = null;
        }
        return persons;
    }
}

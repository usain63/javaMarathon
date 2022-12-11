package day19.task2;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, Point> cars = new HashMap<>();
        File file = new File("/Users/18882337/IdeaProjects/JavaMarathon2021/src/main/resources/taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNext()){
            int id = scanner.nextInt();
            Point pointOfCar = new Point(scanner.nextInt(), scanner.nextInt());
            cars.put(id, pointOfCar);
        }
        scanner.close();

        Scanner scanner1 = new Scanner(System.in);
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0; 
        
        System.out.print("Введите координату Х первой точки от 0 до 99: ");
        x1 = scanner1.nextInt();
        System.out.print("Введите координату Y первой точки от 0 до 99: ");
        y1 = scanner1.nextInt();
        System.out.print("Введите координату Х второй точки от 0 до 99: ");
        x2 = scanner1.nextInt();
        System.out.print("Введите координату Y второй точки от 0 до 99: ");
        y2 = scanner1.nextInt();
        scanner1.close();

        List<Point> pointsOfArea = new ArrayList<>();
        Map<Integer, Point> area = new LinkedHashMap<>();
        if (x1 < x2){
            for (int x = x1 + 1; x < x2; x++)
                if (y1 > y2){
                    for (int y = y1 - 1; y > y2; y--)
                        pointsOfArea.add(new Point(x, y));
                } else {
                    for (int y = y1 + 1; y < y2; y++)
                        pointsOfArea.add(new Point(x, y));
                }
        }
        
        else {
            for (int x = x1 - 1; x > x2; x--){
                if (y1 > y2){
                    for (int y = y1 - 1; y > y2; y--)
                        pointsOfArea.add(new Point(x, y));
                } else {
                    for (int y = y1 + 1; y < y2; y++)
                        pointsOfArea.add(new Point(x, y));
                }
            }
        }

        for (int i = 0; i < pointsOfArea.size(); i++)
            area.put(i, pointsOfArea.get(i));
        
        cars.values().retainAll(area.values());
        
        System.out.print("Идентификаторы машин в квадрате: ");
        for (Map.Entry<Integer, Point> entry:cars.entrySet()) {
            System.out.print(entry.getKey() + ", ");
        }
        System.out.println("\nКоличество машин в квадрате: " + cars.size());
    }
}


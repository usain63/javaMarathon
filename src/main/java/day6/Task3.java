package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student("Миша");
        Student student2 = new Student("Коля");
        Teacher teacher1 = new Teacher("ПЕТР ПЕРВЫЙ", "Кораблестроение");
        
        teacher1.evaluate(student1);
        
    }
}

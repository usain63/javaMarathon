package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Anton", "Первая группа");
        Teacher teacher = new Teacher("Михалыч", "Физкультура");

        System.out.println("Группа студента: " + student.getGroupName());
        System.out.println("Предмет учителя: " + teacher.getSubjectName());
        
        student.printInfo();
        teacher.printInfo();

    }
}

package day6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Teacher {
  private String name;
  private String subject;

  public Teacher(String name, String subject) {
    this.name = name;
    this.subject = subject;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
  
  public void evaluate (Student student) {
    String mark ="";
    Random rand = new Random();
    int markInt = ThreadLocalRandom.current().nextInt(2, 6);
    System.out.println(markInt);
    
    switch (markInt) {
      case 2: 
        mark = "Неудовлетворительно";
        break;
      case 3:
        mark = "Удовлетворительно";
        break;
      case 4: 
        mark = "Хорошо";
        break;
      case 5:
        mark = "Отлично";
        break;
      default:
        mark = "оценка меньше 2";
    }
   // System.out.println(mark);
    System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + 
        " на оценку " + mark);
  }
}

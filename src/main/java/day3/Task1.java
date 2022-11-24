package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String city = scanner.nextLine();
            
//            if (city.equals("Stop")) {
//                break;
//            }
            switch (city){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;

                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;

                default:
                    System.out.println("Неизвестная страна");
                    break;

                case "Stop":
                    return;
            }
        }
    }
}



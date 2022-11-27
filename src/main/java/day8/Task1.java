package day8;

public class Task1 {
    public static void main(String[] args) {
        String x = "";

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            x += Integer.toString(i) + " ";
        }
        System.out.println(x);
        long stopTime = System.currentTimeMillis();
        long timeS = stopTime - startTime;
        System.out.println("Длительность работы, в мс.: " + (timeS));

        StringBuilder y = new StringBuilder("");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            y.append(Integer.toString(i)).append(" ");
        }
        System.out.println(y);
        long stopTime1 = System.currentTimeMillis();
        long timeSB = stopTime1 - startTime1;
        System.out.println("Длительность работы, в мс.: " + (timeSB));

        System.out.println(timeS);
        System.out.println(timeSB);
    }
}

package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random randInt = new Random();
        
        Player player1 = new Player(randInt.nextInt(11)+90);
        Player player2 = new Player(randInt.nextInt(11)+90);
        Player player3 = new Player(randInt.nextInt(11)+90);
        Player player4 = new Player(randInt.nextInt(11)+90);
        Player player5 = new Player(randInt.nextInt(11)+90);
        Player player6 = new Player(randInt.nextInt(11)+90);
        Player.info(); //Создали 6 игроков и проверяем сообщение
        
        Player player7 = new Player(randInt.nextInt(11)+90);
        System.out.println(Player.getCountPlayers()); // создали 7го игрока и проверяем, что количество игроков на поле по прежнему 6
        System.out.println();
        
        while (player5.getStamina() >= Player.MIN_STAMINA)
            player5.run();
        
        System.out.println("Количество игроков на поле " + Player.getCountPlayers());
        Player.info();
        
    }
}

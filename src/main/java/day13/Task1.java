package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Kolya");
        User user2 = new User("VASYA");
        User user3 = new User("MISHA");

        user1.sendMessage(user2, "HELLO!");
        user1.sendMessage(user2, "HOW ARE YOU!");
        
        user2.sendMessage(user1, "Hello");
        user2.sendMessage(user1, "Im fine");
        user2.sendMessage(user1, "And you?");
        
        user3.sendMessage(user1, "Hello");
        user3.sendMessage(user1, "lets play basketball");
        user3.sendMessage(user1, "Or go for tea?");

        user1.sendMessage(user3, "HI");
        user1.sendMessage(user3, "No thanks");
        user1.sendMessage(user3, "Maybe tennis?");

        user3.sendMessage(user1, "Great go tennis");

        MessageDatabase.showDialog(user1, user3);
            
        
    }
}

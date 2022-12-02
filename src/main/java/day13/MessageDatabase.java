package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
  private static List<Message> messages = new ArrayList<>();
  
  public static void addNewMessage(User user1, User user2, String text) {
    messages.add(new Message(user1, user2, text));
  }

  public static List<Message> getMessages() {
    return messages;
  }
  
  public static void showDialog (User u1, User u2) {
    List<Message> toShow = new ArrayList<>();
    for (Message messageToShow: messages) {
      if (messageToShow.getSender() == u1 && messageToShow.getReceiver() == u2)
        toShow.add(messageToShow);
      else if (messageToShow.getSender() == u2 && messageToShow.getReceiver() == u1)
        toShow.add(messageToShow);
    }
    for (Message dialog: toShow) {
      System.out.println(dialog.getSender() + ":" + " " + dialog.getText());
    }
  }
}

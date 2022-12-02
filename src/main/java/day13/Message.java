package day13;


import java.time.LocalDateTime;
import java.util.Date;

public class Message {
  private User sender;
  private User receiver;
  private String text;
  private LocalDateTime date;

  public User getSender() {
    return sender;
  }

  public User getReceiver() {
    return receiver;
  }

  public String getText() {
    return text;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public Message(User sender, User receiver, String text) {
    this.sender = sender;
    this.receiver = receiver;
    this.text = text;
    date = LocalDateTime.now();
  }
  
  public String toString() {
    return "\nFROM: " + sender 
        + "\nTO: " + receiver
        + "\nON: " + date
        + "\n" + text;
  }
}

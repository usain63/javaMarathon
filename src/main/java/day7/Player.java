package day7;

public class Player {
  public static int countPlayers = 0;
  private int stamina = 0;
  public static final int MAX_STAMINA = 100;
  public static final int MIN_STAMINA = 0;

  public static int getCountPlayers() {
    return countPlayers;
  }

  public int getStamina() {
    return stamina;
  }

  public Player(int stamina) {
    this.stamina = stamina;
    while(countPlayers < 6)
    countPlayers++;
  }
  
  public void run() {
    stamina--;
    if (stamina == 0) 
      countPlayers--;
  }
  
  public static void info() {
    String lastWords = "";
    int localCount = 0;
    
    if (countPlayers >= 6)
      System.out.println("На поле нет свободных мест");
    else {
      localCount = 6 - countPlayers;
      switch (localCount){
        case 5:
          lastWords = " cвободных мест";
          break;
        case 2:
        case 3:
        case 4:
          lastWords = " cвободных места";
          break;
        case 1:
          lastWords = " свободное место";
          break;
      }
      System.out.println("Команды неполные. На поле еще есть " + localCount + lastWords);
    }
  }
}

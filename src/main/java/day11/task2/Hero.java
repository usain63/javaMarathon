package day11.task2;

public abstract class Hero {
  public static final int MAX_HEALTH = 100;
  public static final int MIN_HEALTH = 0;
  public int health;
  public int physAtt;
  public float physDef;
  public float magicDef;

  public void physicalAttack(Hero hero) {
    if ((hero.health - physAtt * (1 - hero.physDef)) <= 0)
      hero.health = MIN_HEALTH;
    else
      hero.health -= physAtt * (1 - hero.physDef);
  }
  
  public String toString(){
    return "I m just a hero!";
  }
}

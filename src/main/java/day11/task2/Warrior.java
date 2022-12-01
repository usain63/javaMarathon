package day11.task2;

public class Warrior extends Hero implements PhysAttack{
  private int physAtt;
  
  public Warrior() {
    this.health = 100;
    this.physAtt = 30;
    this.physDef = 0.8F;
    this.magicDef = 0;
  }

  @Override
  public void physicalAttack(Hero hero) {
    if ((hero.health - physAtt * (1 - hero.physDef)) <= 0)
      hero.health = MIN_HEALTH;
    else
      hero.health -= physAtt * (1 - hero.physDef);
  }
  
  public String toString() {
    return "I'm a true WARRIOR with health " + this.health;
  }
}

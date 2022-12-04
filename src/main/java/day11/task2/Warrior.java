package day11.task2;

public class Warrior extends Hero implements PhysAttack{
  private final int physAtt;
  
  public Warrior() {
   
    this.physAtt = 30;
    this.physDef = 0.8F;
    this.magicDef = 0;
  }
  
  public String toString() {
    return "I'm a true WARRIOR with health " + this.health;
  }
}

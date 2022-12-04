package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
  private int physAtt;
  private int magicAtt;

  public Magician() {
    this.physAtt = 5;
    this.magicAtt = 20;
    this.magicDef = 0.8F;
    this.physDef = 0;
  }

  @Override
  public void magicalAttack(Hero hero) {
    if ((hero.health - magicAtt * (1 - hero.magicDef)) <= 0)
      hero.health = MIN_HEALTH;
    else
      hero.health -= magicAtt * (1 - hero.magicDef);
  }

  @Override
  public String toString() {
    return "I'm a MAGICIAN with health " + this.health;
  }
}

package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
  private int physAtt;

  public Paladin() {
    health = 100;
    physAtt = 15;
    physDef = 0.5F;
    magicDef = 0.2F;
  }

  @Override
  public void physicalAttack(Hero hero) {
    if ((hero.health - physAtt * (1 - hero.physDef)) <= 0)
      hero.health = MIN_HEALTH;
    else
      hero.health -= physAtt * (1 - hero.physDef);
  }

  @Override
  public void healHimself() {
    if (this.health + 25 > MAX_HEALTH)
      this.health = MAX_HEALTH;
    else 
      this.health += 25;
  }

  @Override
  public void healTeammate(Hero hero) {
    if (hero.health + 10 > MAX_HEALTH)
      hero.health = MAX_HEALTH;
    else
      hero.health += 10;
  }

  @Override
  public String toString() {
    return "I'am a PALADIN with health " + this.health;
  }
}

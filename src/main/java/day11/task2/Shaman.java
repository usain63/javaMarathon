package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
  private int physAtt;
  private int magicAtt;
  
  public Shaman() {
    this.physAtt = 10;
    this.magicAtt = 15;
    this.health = 100;
    this.magicDef = 0.2F;
    this.physDef = 0.2F;
  }

  @Override
  public void healHimself() {
    if (this.health + 50 > MAX_HEALTH)
      this.health = MAX_HEALTH;
    else
      this.health += 50;
  }

  @Override
  public void healTeammate(Hero hero) {
    if (hero.health + 30 > MAX_HEALTH)
      hero.health = MAX_HEALTH;
    else
      hero.health += 30;
  }

  @Override
  public void magicalAttack(Hero hero) {
    if ((hero.health - magicAtt * (1 - hero.magicDef)) <= 0)
      hero.health = MIN_HEALTH;
    else
      hero.health -= magicAtt * (1 - hero.magicDef);
  }

  @Override
  public void physicalAttack(Hero hero) {
    if ((hero.health - physAtt * (1 - hero.physDef)) <= 0)
      hero.health = MIN_HEALTH;
    else
      hero.health -= physAtt * (1 - hero.physDef);
  }

  @Override
  public String toString() {
    return "I'm a another SHAMAN with health " + this.health;
  }
}

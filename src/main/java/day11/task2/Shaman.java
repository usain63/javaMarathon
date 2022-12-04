package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
  private int physAtt;
  private int magicAtt;
  private final int selfHeal;
  private final int mateHeal;
  
  public Shaman() {
    this.physAtt = 10;
    this.magicAtt = 15;
    this.magicDef = 0.2F;
    this.physDef = 0.2F;
    selfHeal = 50;
    mateHeal = 30;
  }

  @Override
  public void healHimself() {
    if (this.health + selfHeal > MAX_HEALTH)
      this.health = MAX_HEALTH;
    else
      this.health += selfHeal;
  }

  @Override
  public void healTeammate(Hero teamMate) {
    if (teamMate.health + mateHeal > MAX_HEALTH)
      teamMate.health = MAX_HEALTH;
    else
      teamMate.health += mateHeal;
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
    return "I'm a another SHAMAN with health " + this.health;
  }
}

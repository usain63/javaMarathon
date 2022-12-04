package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
  private final int physAtt;
  private final int selfHeal;
  private final int mateHeal;

  public Paladin() {
    physAtt = 15;
    physDef = 0.5F;
    magicDef = 0.2F;
    selfHeal = 25;
    mateHeal = 10;
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
  public String toString() {
    return "I'am a PALADIN with health " + this.health;
  }
}

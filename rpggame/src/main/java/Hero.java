public class Hero extends Character {
  int actionsTaken;

  public Hero(int x, int y, int level) {
    this.level = level;
    actionsTaken = 1;
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().HERO_DOWN;
    maxHP = 20 + (3 * dice.D6()) + (level * dice.D6());
    maxDP = 4 + (dice.D6()) + (level * dice.D6());
    maxSP = 5 + (dice.D6()) + (level * dice.D6());
    HP = maxHP;
    DP = maxDP;
    SP = maxSP;
  }
}

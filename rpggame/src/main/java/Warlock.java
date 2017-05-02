public class Warlock extends Monster {

  public Warlock(int x, int y, int level) {
    type = "Warlock";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().WARLOCK;
    maxHP = 10 + 2 * level * dice.D6();
    maxDP = level * dice.D6();
    maxSP = level * dice.D6();
    HP = maxHP;
    DP = maxDP;
    SP = maxSP;
  }
}

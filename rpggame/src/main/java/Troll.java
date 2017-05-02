public class Troll extends Monster {

  public Troll(int x, int y, int level) {
    type = "Troll";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().TROLL;
    maxHP = 10 + 2 * level * dice.D6();
    maxDP = level * dice.D6();
    maxSP = level * dice.D6();
    HP = maxHP;
    DP = maxDP;
    SP = maxSP;
  }
}
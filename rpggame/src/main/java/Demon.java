public class Demon extends Monster {

  public Demon(int x, int y, int level) {
    type = "Demon";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().DEMON;
    maxHP = 10 + 2 * level * dice.D6();
    maxDP = level * dice.D6();
    maxSP = level * dice.D6();
    HP = maxHP;
    DP = maxDP;
    SP = maxSP;
  }
}

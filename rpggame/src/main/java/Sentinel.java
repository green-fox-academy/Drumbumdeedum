public class Sentinel extends Monster {

  public Sentinel(int x, int y, int level) {
    type = "Sentinel";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().SENTINEL;
    maxHP = 10 + 2 * level * dice.D6();
    maxDP = level * dice.D6();
    maxSP = level * dice.D6();
    HP = maxHP;
    DP = maxDP;
    SP = maxSP;
  }
}

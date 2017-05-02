public class Orc extends Monster {

  public Orc(int x, int y, int level) {
    type = "Orc";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().ORC;
    maxHP = 10 + 2 * level * dice.D6();
    maxDP = level * dice.D6();
    maxSP = level * dice.D6();
    HP = maxHP;
    DP = maxDP;
    SP = maxSP;
  }
}

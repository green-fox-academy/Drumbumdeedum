public class Dragon extends Monster {

  public Dragon(int x, int y, int level) {
    type = "Dragon";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().DRAGON;
    maxHP = 10 + 2 * level * dice.D6();
    maxDP = level * dice.D6();
    maxSP = level * dice.D6();
    HP = maxHP;
    DP = maxDP;
    SP = maxSP;
  }
}

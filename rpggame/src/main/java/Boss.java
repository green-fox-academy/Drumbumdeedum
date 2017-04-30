public class Boss extends Monster {

  public Boss(int x, int y, int level) {
    type = "Boss";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().BOSS;
    maxHP = 20 + 2 * level * dice.D6() + dice.D6();
    maxDP = level * dice.D6() + dice.D6()/2;
    maxSP = 3 + dice.D6() + level * dice.D6();
    HP = maxHP;
    DP = maxDP;
    SP = maxSP;
  }
}

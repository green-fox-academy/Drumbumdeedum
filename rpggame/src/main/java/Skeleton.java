public class Skeleton extends Monster {
  boolean hasKey;

  public Skeleton(int x, int y, int level) {
    type = "Skeleton";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().SKELETON;
    maxHP = 10 + 2 * level * dice.D6();
    maxDP = level * dice.D6();
    maxSP = level * dice.D6();
    HP = maxHP;
    DP = maxDP;
    SP = maxSP;
    hasKey = false;
  }
}

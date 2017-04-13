public class Skeleton extends Monsters {

  public Skeleton(int x, int y) {
    this.locX = x;
    this.locY = y;
    mapID = 4;
    image = ImageLoader.getInstance().SKELETON;
    HP = 2 * (dice.ranNum(1, 6));
    DP = 2 * (dice.ranNum(1, 6));
    SP = (dice.ranNum(1, 6));
  }
}
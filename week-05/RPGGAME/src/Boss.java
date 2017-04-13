public class Boss extends Monsters{

  public Boss(int x, int y) {
    this.locX = x;
    this.locY = y;
    mapID = 3;
    image = ImageLoader.getInstance().BOSS;
    HP = 2 * (dice.ranNum(1, 6)) + (dice.ranNum(1, 6));
    DP = 2 * (dice.ranNum(1, 6)) + (dice.ranNum(1, 6) / 2);
    SP = (dice.ranNum(1, 6));
  }
}

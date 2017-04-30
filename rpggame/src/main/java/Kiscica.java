public class Kiscica extends Monster {

  public Kiscica(int x, int y) {
    type = "Kiscica";
    this.locX = x;
    this.locY = y;
    image = ImageHandler.getInstance().KISCICA;
    HP = 1;
    DP = 0;
    SP = 0;
  }
}

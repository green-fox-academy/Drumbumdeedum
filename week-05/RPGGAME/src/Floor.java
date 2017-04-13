public class Floor extends GameObject {

  public Floor(int x, int y) {
    mapID = 0;
    image = ImageLoader.getInstance().FLOOR;
    this.locX = x;
    this.locY = y;
  }
}

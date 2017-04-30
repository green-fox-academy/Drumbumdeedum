public class Heart extends Tile {

  public Heart(int x, int y) {
    type = "Heart";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().HEART;
  }
}

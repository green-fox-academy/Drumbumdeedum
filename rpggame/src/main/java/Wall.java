public class Wall extends Tile {

  public Wall(int x, int y) {
    type = "Wall";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().WALL;
  }
}

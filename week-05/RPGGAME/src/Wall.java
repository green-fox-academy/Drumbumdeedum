public class Wall extends GameObject {

  public Wall(int x, int y) {
    mapID = 1;
    image = ImageLoader.getInstance().WALL;
    this.locX = x;
    this.locY = y;
  }
}


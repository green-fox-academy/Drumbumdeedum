public class Floor extends Tile {
  Boolean visited;

  public Floor(int x, int y) {
    visited = false;
    type = "Floor";
    locX = x;
    locY = y;
    image = ImageHandler.getInstance().FLOOR;
  }

  public boolean wasVisited() {
    return this.visited;
  }

  public void setVisitedTrue() {
    this.visited = true;
  }
}

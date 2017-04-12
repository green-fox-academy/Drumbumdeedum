import java.awt.Graphics;
import java.util.ArrayList;

public class GameArea {
  int[][] wallMap;
  int[][] newGameArea = {
    {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
    {0, 0, 0, 1, 0, 1, 1, 1, 1, 0},
    {0, 1, 1, 1, 0, 0, 0, 1, 0, 0},
    {0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
    {1, 1, 1, 0, 1, 1, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
    {0, 1, 1, 0, 1, 1, 0, 1, 0, 0},
    {0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}
  };

  public GameArea() {
    wallMap = newGameArea;
  }

  public void drawArea(Graphics graphics) {
    for (int i=0; i < 10; i += 1) {
      for (int j=0; j < 10; j += 1) {
        if (this.wallMap[j][i] == 1) {
          Wall newObject = new Wall(i, j);
          newObject.drawGameObject(graphics);
        } else {
          Floor newObject = new Floor(i, j);
          newObject.drawGameObject(graphics);
        }
      }
    }
  }

  public boolean isWall(int x, int y) {
    if (wallMap[y][x] == 1) {
      return true;
    } else {
      return false;
    }
  }
}
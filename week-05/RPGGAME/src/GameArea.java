import java.awt.Graphics;

public class GameArea {
  int[][] wallMap;
  int[][] newGameArea = {
      {9, 0, 0, 1, 0, 0, 0, 0, 0, 0},
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
        } else if (this.wallMap[j][i] == 3) {
          Floor newObject = new Floor(i, j);
          newObject.drawGameObject(graphics);
          Boss newBoss = new Boss(i, j);
          newBoss.drawGameObject(graphics);
        } else if (this.wallMap[j][i] == 4) {
          Floor newObject = new Floor(i, j);
          newObject.drawGameObject(graphics);
          Skeleton newSkeleton = new Skeleton(i, j);
          newSkeleton.drawGameObject(graphics);
        } else if (this.wallMap[j][i] == 0 || this.wallMap[j][i] == 9) {
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

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



  public boolean isWall(int x, int y) {
    if (wallMap[y][x] == 1) {
      return true;
    } else {
      return false;
    }
  }
}

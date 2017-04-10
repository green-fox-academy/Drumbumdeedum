import java.awt.Graphics;
import java.util.ArrayList;

public class Area {
  ArrayList<int[]> wallMap;
  final static int SIZE = 72;

  public Area() {
    wallMap = new ArrayList<>();
    int[] line00 = {0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
    int[] line01 = {0, 0, 0, 1, 0, 1, 0, 0, 0, 0};
    int[] line02 = {0, 0, 0, 1, 0, 1, 1, 1, 1, 0};
    int[] line03 = {0, 1, 1, 1, 0, 0, 0, 1, 0, 0};
    int[] line04 = {0, 0, 0, 0, 0, 1, 0, 1, 0, 0};
    int[] line05 = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
    int[] line06 = {0, 0, 0, 0, 0, 0, 0, 1, 1, 0};
    int[] line07 = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
    int[] line08 = {0, 1, 1, 0, 0, 1, 0, 1, 0, 0};
    int[] line09 = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
    wallMap.add(line00);
    wallMap.add(line01);
    wallMap.add(line02);
    wallMap.add(line03);
    wallMap.add(line04);
    wallMap.add(line05);
    wallMap.add(line06);
    wallMap.add(line07);
    wallMap.add(line08);
    wallMap.add(line09);
  }

  public void drawArea(Graphics graphics) {
    for (int i=0; i < 10; i += 1) {
      for (int j=0; j < 10; j += 1) {
        if (this.wallMap.get(j)[i] == 1) {
          Wall wall = new Wall(i*SIZE, j*SIZE);
          wall.draw(graphics);
        } else {
          Floor floor = new Floor(i*SIZE, j*SIZE);
          floor.draw(graphics);
        }
      }
    }
  }
}

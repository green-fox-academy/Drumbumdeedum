import java.awt.*;

public class Hud {

  final static int HEIGHT = 100;
  final static int SIZE = 720;

  public static void drawHud(Graphics g, int x, int y, Characters hero) {
    fillBackGround(g, x, y);
    g.setColor(Color.white);
    g.drawString(hero.currentStats, 15,  SIZE + 25);
  }

  private static void fillBackGround(Graphics g, int x, int y) {
    g.setColor(Color.white);
    g.fillRect(x, SIZE, SIZE, HEIGHT);
    int border = 5;
    g.setColor(Color.black);
    g.fillRect(border, SIZE + border, SIZE - border*2, HEIGHT);
  }
}

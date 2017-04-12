import java.awt.*;

public class Hud {

  final static int HEIGHT = 130;

  public static void drawHud(Graphics g, int x, int y) {
    fillBackGround(g, x, y);
    g.setColor(Color.black);
  }

  private static void fillBackGround(Graphics g, int x, int y) {
    g.setColor(Color.white);
    g.fillRect(x, y - HEIGHT, 720, HEIGHT);
  }
}

import java.awt.*;

public class Hud {

  final static int HEIGHT = 100;

  public static void drawHud(Graphics g, int x, int y) {
    fillBackGround(g, x, y);
    g.setColor(Color.white);
  }

  private static void fillBackGround(Graphics g, int x, int y) {
    g.setColor(Color.white);
    g.fillRect(x, 720, 720, HEIGHT);
    g.setColor(Color.black);
    g.fillRect(5, 725, 710, HEIGHT);
  }
}

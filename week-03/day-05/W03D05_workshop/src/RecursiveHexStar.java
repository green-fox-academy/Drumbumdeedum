import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Polygon;

public class RecursiveHexStar {

  public static void mainDraw(Graphics g) {
    drawHexagon(4, 300, 300, 200, g);
  }

  public static void drawHexagon(int depth, double centerX, double centerY, double side, Graphics g) {
    Polygon p = new Polygon();
    for (int i=1; i < 7; i++) {
      p.addPoint((int) (centerX + side * Math.cos(i * 2 * Math.PI / 6)), (int) (centerY + side * Math.sin(i * 2 * Math.PI / 6)));
    }
    g.drawPolygon(p);

    if (depth > 0) {
      drawHexagon(depth - 1, centerX - side / 3, centerY - side / Math.sqrt(3), side / 3, g);
      drawHexagon(depth - 1, centerX + side / 3, centerY - side / Math.sqrt(3), side / 3, g);
      drawHexagon(depth - 1, centerX + side/3*2, centerY, side / 3, g);
      drawHexagon(depth - 1, centerX - side/3*2, centerY, side / 3, g);
      drawHexagon(depth - 1, centerX - side / 3, centerY + side / Math.sqrt(3), side / 3, g);
      drawHexagon(depth - 1, centerX + side / 3, centerY + side / Math.sqrt(3), side / 3, g);
    }
  }

  //    Don't touch the code below!!!
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 620));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

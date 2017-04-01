import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Polygon;
import java.awt.*;

public class SquareGrid {

  public static void mainDraw(Graphics g) {

    double color1 = 1;
    double color2 = 1;
    double color3 = 1;

    drawRecursiveSquare(6, 400, 400, 300, 20, color1, color2, color3,  g);
  }

  public static void drawRecursiveSquare(int depth, double centerX, double centerY, double side, float lineWidth, double color1, double color2, double color3, Graphics g) {

    Polygon square = new Polygon();

    Graphics2D g2d = (Graphics2D)g;
    g2d.setStroke(new BasicStroke(lineWidth));

    square.addPoint((int)(centerX - side/2), (int)(centerY - side/2));
    square.addPoint((int)(centerX + side/2), (int)(centerY - side/2));
    square.addPoint((int)(centerX + side/2), (int)(centerY + side/2));
    square.addPoint((int)(centerX - side/2), (int)(centerY + side/2));

    color1 = 1 * Math.random() * 255 + 1;
    color2 = 1 * Math.random() * 255 + 1;
    color3 = 1 * Math.random() * 255 + 1;

    g.setColor(new Color((int)color1,(int)color2,(int)color3, 255));
    g.drawPolygon(square);

    if (depth > 0) {
      drawRecursiveSquare(depth-1, centerX - side/2, centerY - side/2, side / 2, lineWidth / 2, color1, color2, color3, g);
      drawRecursiveSquare(depth-1, centerX + side/2, centerY - side/2, side / 2, lineWidth / 2, color1, color2, color3, g);
      drawRecursiveSquare(depth-1, centerX - side/2, centerY + side/2, side / 2, lineWidth / 2, color1, color2, color3, g);
      drawRecursiveSquare(depth-1, centerX + side/2, centerY + side/2, side / 2, lineWidth / 2, color1, color2, color3, g);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(800, 820));
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

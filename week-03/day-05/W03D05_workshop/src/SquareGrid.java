import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Polygon;
import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

public class SquareGrid {

  public static void mainDraw(Graphics g) {
    drawRecursiveSquare(6, 420, 420, 400, 20,  g);
  }

  public static void drawRecursiveSquare(int depth, double centerX, double centerY, double side, float lineWidth, Graphics g) {

    Polygon square = new Polygon();

    Graphics2D g2d = (Graphics2D)g;
    g2d.setStroke(new BasicStroke(lineWidth));

    square.addPoint((int)(centerX - side/2), (int)(centerY - side/2));
    square.addPoint((int)(centerX + side/2), (int)(centerY - side/2));
    square.addPoint((int)(centerX + side/2), (int)(centerY + side/2));
    square.addPoint((int)(centerX - side/2), (int)(centerY + side/2));

    g.drawPolygon(square);

    if (depth > 0) {
      drawRecursiveSquare(depth-1, centerX - side/2, centerY - side/2, side / 2, lineWidth / 2, g);
      drawRecursiveSquare(depth-1, centerX + side/2, centerY - side/2, side / 2, lineWidth / 2, g);
      drawRecursiveSquare(depth-1, centerX - side/2, centerY + side/2, side / 2, lineWidth / 2, g);
      drawRecursiveSquare(depth-1, centerX + side/2, centerY + side/2, side / 2, lineWidth / 2, g);
    }
  }

  //    Don't touch the code below
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

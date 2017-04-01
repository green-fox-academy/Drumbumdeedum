import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Polygon;

public class RecursiveTriangle {

  public static void mainDraw(Graphics g) {

    drawRecursiveTriangle(6, 300, 300, 400, g);
  }

  public static void drawRecursiveTriangle(int depth, double centerX, double centerY, double side, Graphics g) {

    double height = (side*Math.sqrt(3d))/2d;

    Polygon triangle = new Polygon();

    triangle.addPoint((int)(centerX - side/2), (int)(centerY - height/2));
    triangle.addPoint((int)(centerX + side/2), (int)(centerY - height/2));
    triangle.addPoint((int)(centerX - 0), (int)(centerY + height/2));

    g.drawPolygon(triangle);

    if (depth > 0) {
      drawRecursiveTriangle(depth - 1, centerX - side/4d ,(centerY - height/4d), side/2d, g);
      drawRecursiveTriangle(depth - 1, (centerX + side/4d),(centerY - height/4d), side/2d, g);
      drawRecursiveTriangle(depth - 1, centerX, (centerY + height/4d), side/2d, g);
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

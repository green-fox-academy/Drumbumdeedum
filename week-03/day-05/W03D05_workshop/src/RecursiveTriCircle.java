import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Polygon;

public class RecursiveTriCircle {

  public static void mainDraw(Graphics g) {
    drawRecursiveTriCircle(2, 0,0,500, g);

  }

  public static void drawRecursiveTriCircle(int depth, double centerX, double centerY, double heightWidth, Graphics g) {
    g.drawOval((int)centerX, (int)centerY, (int)heightWidth, (int)heightWidth);

    int circleCenter = (int)(heightWidth/2);

    g.drawLine(circleCenter,circleCenter, circleCenter, 0);

  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(700, 720));
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

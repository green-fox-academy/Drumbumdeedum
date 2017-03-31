import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RecursiveTriCircle {

  public static void mainDraw(Graphics g) {
    drawTriCircle(3, 150,150, 300, g);
  }

  public static void drawTriCircle(int depth, double centerX, double centerY, double heightWidth, Graphics g) {
    double centerCircleX = centerX - heightWidth/2d;
    double centerCircleY = centerY - heightWidth/2d;

    g.drawOval((int) centerCircleX, (int) centerCircleY, (int) heightWidth, (int) heightWidth);

    if (depth > 0) {
      drawTriCircle(depth - 1, centerX, centerY-heightWidth/4, heightWidth/2, g);
      drawTriCircle(depth - 1, (int)centerX-heightWidth/4.67d, (int)centerCircleY+heightWidth/1.6d, heightWidth/2, g);
      drawTriCircle(depth - 1, (int)centerX+heightWidth/4.67d, (int)centerCircleY+heightWidth/1.6d, heightWidth/2, g);
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

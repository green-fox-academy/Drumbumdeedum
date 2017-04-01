import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RecursiveTriCircle {

  public static void mainDraw(Graphics g) {
    drawTriCircle(3, 300,300, 400, g);
  }

  public static void drawTriCircle(int depth, double centerX, double centerY, double heightWidth, Graphics g) {
    double centerCircleX = centerX - heightWidth/2d;
    double centerCircleY = centerY - heightWidth/2d;

    double color1 = Math.random() * 255 + 1;
    double color2 = Math.random() * 255 + 1;
    double color3 = Math.random() * 255 + 1;
    g.setColor(new Color((int) color1, (int) color2, (int) color3, 155));

    g.fillOval((int) centerCircleX, (int) centerCircleY, (int) heightWidth, (int) heightWidth);

    if (depth > 0) {
      drawTriCircle(depth - 1, centerX, centerY-heightWidth/4d, heightWidth/2d, g);
      drawTriCircle(depth - 1, (int)(centerX-(int)(Math.sin(Math.toRadians(62)) * heightWidth/4)), (int)(centerY+(int)(Math.sin(Math.toRadians(30)) * heightWidth/4)), heightWidth/2d, g);
      drawTriCircle(depth - 1, (int)(centerX+(int)(Math.sin(Math.toRadians(62)) * heightWidth/4)), (int)(centerY+(int)(Math.sin(Math.toRadians(30)) * heightWidth/4)), heightWidth/2d, g);
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

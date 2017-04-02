import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;
import java.awt.*;

public class RecursiveTree {

  public static void mainDraw(Graphics g) {
    drawTree(7,550, 700, -90, 35, 150, 17, 70, 50,30, g);
    g.setColor(new Color(102,170,85));
    g.fillRect(0,700,1000,100);
    g.setColor(new Color(255,255,0));
    g.fillOval(20,20,200,200);
  }

  public static void drawTree(int depth, int startX, int startY, double angle, double angleAdjust, double length, double lineWidth, int color1, int color2, int color3, Graphics g) {

    double endX = startX + length * Math.cos(Math.toRadians(angle));
    double endY = startY + length * Math.sin(Math.toRadians(angle));

    Graphics2D g2d = (Graphics2D)g;
    g2d.setStroke(new BasicStroke((int)lineWidth));

    g.setColor(new Color(color1,color2,color3));
    g.drawLine(startX, startY, (int)endX , (int)endY);

    if (depth > 1) {
      drawTree(depth - 1, (int)endX, (int)endY, angle + angleAdjust, angleAdjust, length*0.75, lineWidth * 0.8, color1, color2+10, color3, g);
      drawTree(depth - 1, (int)endX, (int)endY, angle, angleAdjust, length*0.75, lineWidth * 0.8,color1, color2+10, color3, g);
      drawTree(depth - 1, (int)endX, (int)endY, angle - angleAdjust, angleAdjust, length*0.75, lineWidth * 0.8, color1, color2+10, color3, g);
    }
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(1000, 800));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.WHITE);
      mainDraw(graphics);
    }
  }
}
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;
import java.awt.*;

public class RecursiveTree {

  public static void mainDraw(Graphics g) {
    drawTree(7,0, 700, -90, 35, 100, 17, 70, 50,30, g);
    drawTree(7,75, 700, -90, 35, 50, 17, 70, 50,30, g);
    drawTree(7,150, 700, -90, 35, 70, 17, 70, 50,30, g);
    drawTree(7,225, 700, -90, 35, 90, 17, 70, 50,30, g);
    drawTree(7,300, 700, -90, 35, 40, 17, 70, 50,30, g);
    drawTree(7,370, 700, -90, 35, 120, 17, 70, 50,30, g);
    drawTree(7,450, 700, -90, 35, 60, 17, 70, 50,30, g);
    drawTree(7,525, 700, -90, 35, 50, 17, 70, 50,30, g);
    drawTree(7,600, 700, -90, 35, 80, 17, 70, 50,30, g);
    drawTree(7,675, 700, -90, 35, 100, 17, 70, 50,30, g);
    drawTree(7,750, 700, -90, 35, 40, 17, 70, 50,30, g);
    drawTree(7,820, 700, -90, 35, 60, 17, 70, 50,30, g);
    drawTree(7,905, 700, -90, 35, 130, 17, 70, 50,30, g);
    drawTree(7,970, 700, -90, 35, 80, 17, 70, 50,30, g);
    drawTree(7,1005, 700, -90, 35, 100, 17, 70, 50,30, g);

    g.setColor(new Color(102,170,85));
    g.fillRect(0,700,2000,300);
    g.setColor(new Color(255,255,148));
    g.fillOval(20,20,200,200);
    g.setColor(new Color(31,32,91));
    g.fillOval(60,40,200,200);

    for (int i=0; i < 50; i++) {
      drawStar((int)(Math.random() * 850 + 150), (int)(Math.random() * 240 + 0),10, g);
    }



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

  public static void drawStar(double centerX, double centerY, double side, Graphics g) {

    double height = (side * Math.sqrt(3d)) / 2d;
    Polygon triangle = new Polygon();

    triangle.addPoint((int) (centerX - side / 2), (int) (centerY - height / 2));
    triangle.addPoint((int) (centerX + side / 2), (int) (centerY - height / 2));
    triangle.addPoint((int) (centerX - 0), (int) (centerY + height / 2));

    g.setColor(new Color(255, 255, 148));
    g.fillPolygon(triangle);

    Polygon triangle2 = new Polygon();

    triangle2.addPoint((int) (centerX - side / 2), (int) (centerY + height/6));
    triangle2.addPoint((int) (centerX + side / 2), (int) (centerY + height/6));
    triangle2.addPoint((int) (centerX - 0), (int) (centerY - height*.9));

    g.setColor(new Color(255, 255, 148));
    g.fillPolygon(triangle2);
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
      this.setBackground(new Color (	31,	32,	91));
      mainDraw(graphics);
    }
  }
}
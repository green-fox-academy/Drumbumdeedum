import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

  public static void mainDraw(Graphics graphics){

    drawHexagon(150, 60, graphics);
  }

  public static void drawHexagon (int centerX, int centerY, Graphics graphics) {

    int triangleSide = 20;
    int sideHalf = triangleSide /2;
    Double sideDouble = triangleSide*Math.sqrt(3)/2;
    int triangleHeight = sideDouble.intValue();

    graphics.drawLine(centerX-triangleSide, centerY,centerX-sideHalf, centerY-triangleHeight);
    graphics.drawLine(centerX-sideHalf,centerY-triangleHeight,centerX+sideHalf, centerY-triangleHeight);
    graphics.drawLine(centerX+sideHalf,centerY-triangleHeight,centerX+triangleSide, centerY);
    graphics.drawLine(centerX+triangleSide,centerY,centerX+sideHalf, centerY+triangleHeight);
    graphics.drawLine(centerX+sideHalf,centerY+triangleHeight,centerX-sideHalf, centerY+triangleHeight);
    graphics.drawLine(centerX-sideHalf,centerY+triangleHeight,centerX-triangleSide, centerY);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}

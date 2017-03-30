import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

  public static void mainDraw(Graphics graphics){

    drawHexagon(200, 50, graphics);
  }

  public static void drawHexagon (int centerX, int centerY, Graphics graphics) {

    int triangleSide = 20;
    int sideHalf = triangleSide /2;
    Double sideDouble = triangleSide*Math.sqrt(3)/2;
    int triangleHeight = sideDouble.intValue();

    // middle column
    for (int i=0; i < 10; i+=2) {
      graphics.drawLine(centerX-triangleSide, centerY + triangleHeight * i,centerX-sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+triangleSide, centerY + triangleHeight * i);
      graphics.drawLine(centerX+triangleSide,centerY + triangleHeight * i,centerX+sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-triangleSide, centerY + triangleHeight * i);
    }

    // first right column
    centerX += triangleSide + triangleSide/2;
    centerY += triangleHeight;

    for (int i=0; i < 8; i+=2) {
      graphics.drawLine(centerX-triangleSide, centerY + triangleHeight * i,centerX-sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+triangleSide, centerY + triangleHeight * i);
      graphics.drawLine(centerX+triangleSide,centerY + triangleHeight * i,centerX+sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-triangleSide, centerY + triangleHeight * i);
    }

    //second right column
    centerX += triangleSide + triangleSide/2;
    centerY += triangleHeight;

    for (int i=0; i < 6; i+=2) {
      graphics.drawLine(centerX-triangleSide, centerY + triangleHeight * i,centerX-sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+triangleSide, centerY + triangleHeight * i);
      graphics.drawLine(centerX+triangleSide,centerY + triangleHeight * i,centerX+sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-triangleSide, centerY + triangleHeight * i);
    }

    centerX = 200;
    centerY = 50;

    // first left column
    centerX -= triangleSide + triangleSide/2;
    centerY += triangleHeight;

    for (int i=0; i < 8; i+=2) {
      graphics.drawLine(centerX-triangleSide, centerY + triangleHeight * i,centerX-sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+triangleSide, centerY + triangleHeight * i);
      graphics.drawLine(centerX+triangleSide,centerY + triangleHeight * i,centerX+sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-triangleSide, centerY + triangleHeight * i);
    }

    //second left column
    centerX -= triangleSide + triangleSide/2;
    centerY += triangleHeight;

    for (int i=0; i < 6; i+=2) {
      graphics.drawLine(centerX-triangleSide, centerY + triangleHeight * i,centerX-sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+sideHalf, centerY-triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY-triangleHeight + triangleHeight * i,centerX+triangleSide, centerY + triangleHeight * i);
      graphics.drawLine(centerX+triangleSide,centerY + triangleHeight * i,centerX+sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX+sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-sideHalf, centerY+triangleHeight + triangleHeight * i);
      graphics.drawLine(centerX-sideHalf,centerY+triangleHeight + triangleHeight * i,centerX-triangleSide, centerY + triangleHeight * i);
    }


    /*
    graphics.drawLine(centerX-triangleSide, centerY,centerX-sideHalf, centerY-triangleHeight);
    graphics.drawLine(centerX-sideHalf,centerY-triangleHeight,centerX+sideHalf, centerY-triangleHeight);
    graphics.drawLine(centerX+sideHalf,centerY-triangleHeight,centerX+triangleSide, centerY);
    graphics.drawLine(centerX+triangleSide,centerY,centerX+sideHalf, centerY+triangleHeight);
    graphics.drawLine(centerX+sideHalf,centerY+triangleHeight,centerX-sideHalf, centerY+triangleHeight);
    graphics.drawLine(centerX-sideHalf,centerY+triangleHeight,centerX-triangleSide, centerY);

    graphics.drawLine(centerX-triangleSide, centerY + triangleHeight * 2,centerX-sideHalf, centerY-triangleHeight + triangleHeight * 2);
    graphics.drawLine(centerX-sideHalf,centerY-triangleHeight + triangleHeight * 2,centerX+sideHalf, centerY-triangleHeight + triangleHeight * 2);
    graphics.drawLine(centerX+sideHalf,centerY-triangleHeight + triangleHeight * 2,centerX+triangleSide, centerY + triangleHeight * 2);
    graphics.drawLine(centerX+triangleSide,centerY + triangleHeight * 2,centerX+sideHalf, centerY+triangleHeight + triangleHeight * 2);
    graphics.drawLine(centerX+sideHalf,centerY+triangleHeight + triangleHeight * 2,centerX-sideHalf, centerY+triangleHeight + triangleHeight * 2);
    graphics.drawLine(centerX-sideHalf,centerY+triangleHeight + triangleHeight * 2,centerX-triangleSide, centerY + triangleHeight * 2);

    graphics.drawLine(centerX-triangleSide, centerY + triangleHeight * 4,centerX-sideHalf, centerY-triangleHeight + triangleHeight * 4);
    graphics.drawLine(centerX-sideHalf,centerY-triangleHeight + triangleHeight * 4,centerX+sideHalf, centerY-triangleHeight + triangleHeight * 4);
    graphics.drawLine(centerX+sideHalf,centerY-triangleHeight + triangleHeight * 4,centerX+triangleSide, centerY + triangleHeight * 4);
    graphics.drawLine(centerX+triangleSide,centerY + triangleHeight * 4,centerX+sideHalf, centerY+triangleHeight + triangleHeight * 4);
    graphics.drawLine(centerX+sideHalf,centerY+triangleHeight + triangleHeight * 4,centerX-sideHalf, centerY+triangleHeight + triangleHeight * 4);
    graphics.drawLine(centerX-sideHalf,centerY+triangleHeight + triangleHeight * 4,centerX-triangleSide, centerY + triangleHeight * 4);

    graphics.drawLine(centerX-triangleSide, centerY + triangleHeight * 6,centerX-sideHalf, centerY-triangleHeight + triangleHeight * 6);
    graphics.drawLine(centerX-sideHalf,centerY-triangleHeight + triangleHeight * 6,centerX+sideHalf, centerY-triangleHeight + triangleHeight * 6);
    graphics.drawLine(centerX+sideHalf,centerY-triangleHeight + triangleHeight * 6,centerX+triangleSide, centerY + triangleHeight * 6);
    graphics.drawLine(centerX+triangleSide,centerY + triangleHeight * 6,centerX+sideHalf, centerY+triangleHeight + triangleHeight * 6);
    graphics.drawLine(centerX+sideHalf,centerY+triangleHeight + triangleHeight * 6,centerX-sideHalf, centerY+triangleHeight + triangleHeight * 6);
    graphics.drawLine(centerX-sideHalf,centerY+triangleHeight + triangleHeight * 6,centerX-triangleSide, centerY + triangleHeight * 6);

    graphics.drawLine(centerX-triangleSide, centerY +  triangleHeight * 8,centerX-sideHalf, centerY-triangleHeight + triangleHeight * 8);
    graphics.drawLine(centerX-sideHalf,centerY-triangleHeight + triangleHeight * 8,centerX+sideHalf, centerY-triangleHeight + triangleHeight * 8);
    graphics.drawLine(centerX+sideHalf,centerY-triangleHeight + triangleHeight * 8,centerX+triangleSide, centerY + triangleHeight * 8);
    graphics.drawLine(centerX+triangleSide,centerY + triangleHeight * 8,centerX+sideHalf, centerY+triangleHeight + triangleHeight * 8);
    graphics.drawLine(centerX+sideHalf,centerY+triangleHeight + triangleHeight * 8,centerX-sideHalf, centerY+triangleHeight + triangleHeight * 8);
    graphics.drawLine(centerX-sideHalf,centerY+triangleHeight + triangleHeight * 8,centerX-triangleSide, centerY + triangleHeight * 8);
    */
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

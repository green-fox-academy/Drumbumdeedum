import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RecursiveHexagon {
  public static void mainDraw(Graphics graphics){

    drawHexagon(300,200,graphics);

  }

  public static void drawHexagon (int centerPoint, int sideLength, Graphics graphics) {
    int halfSide = sideLength / 2;
    Double sideDouble = sideLength*Math.sqrt(3)/2;
    int triangleHeight = sideDouble.intValue();

    graphics.drawLine(centerPoint-sideLength, centerPoint, centerPoint-halfSide, centerPoint-triangleHeight);
    graphics.drawLine(centerPoint-halfSide, centerPoint-triangleHeight, centerPoint+halfSide, centerPoint-triangleHeight);
    graphics.drawLine(centerPoint+halfSide, centerPoint-triangleHeight, centerPoint+sideLength, centerPoint);
    graphics.drawLine(centerPoint+sideLength, centerPoint, centerPoint+halfSide,centerPoint+triangleHeight);
    graphics.drawLine(centerPoint+halfSide, centerPoint+triangleHeight, centerPoint-halfSide, centerPoint+triangleHeight);
    graphics.drawLine(centerPoint-halfSide, centerPoint+triangleHeight, centerPoint-sideLength, centerPoint);

    graphics.drawLine(centerPoint, centerPoint, centerPoint-halfSide, centerPoint);
    graphics.drawLine(centerPoint-halfSide, centerPoint, centerPoint-triangleHeight ,centerPoint-triangleHeight/2 );
    graphics.drawLine(centerPoint-halfSide, centerPoint, centerPoint-halfSide*2 ,centerPoint+triangleHeight/2 );



    graphics.drawLine(centerPoint, centerPoint, centerPoint+halfSide/2, centerPoint-triangleHeight/2);



    graphics.drawLine(centerPoint, centerPoint, centerPoint+halfSide/2, centerPoint+triangleHeight/2);







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

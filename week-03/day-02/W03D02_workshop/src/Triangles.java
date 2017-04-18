import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics){

    // Where should the top of the big triangle be?
    int centerX = 325;
    int centerY = 30;

    // What should the length of the small triangles sides be?
    int triangleSide = 10;

    // How many rows of small triangles should the big triangle have?
    int triangleRows = 60;

    int sideHalf = triangleSide /2;
    Double sideDouble = triangleSide*Math.sqrt(3)/2;
    int triangleHeight = sideDouble.intValue();

    for (int i = 1; i < triangleRows+1; i++) {
      graphics.drawLine(centerX+sideHalf*i, centerY+triangleHeight*i, centerX-sideHalf*i,centerY+triangleHeight*i);
      graphics.drawLine(centerX-sideHalf*(i-1), centerY+triangleHeight*(i-1), centerX+sideHalf*triangleRows-triangleSide*(i-1),centerY+triangleHeight*triangleRows);
      graphics.drawLine(centerX+sideHalf*(i-1), centerY+triangleHeight*(i-1), centerX-sideHalf*triangleRows+triangleSide*(i-1),centerY+triangleHeight*triangleRows);
    }
  }
  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(650, 620));
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

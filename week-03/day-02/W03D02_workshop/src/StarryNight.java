import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {

  public static void mainDraw(Graphics graphics){
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)


    drawStars(10, graphics);

  }

  public static void drawStars (int input, Graphics graphics) {

    graphics.setColor(new Color(0,0,0,255));
    graphics.fillRect(0, 0, 300, 300);

    for (int i=0; i < input; i++) {

      Double rgbDouble = (Math.random() * 255 + 1);
      int rgbCode = rgbDouble.intValue();

      Double startingPointXDouble = (Math.random() * 290 + 0);
      int startingPointX = startingPointXDouble.intValue();
      Double startingPointYDouble = (Math.random() * 290 + 0);
      int startingPointY = startingPointYDouble.intValue();

      graphics.setColor(new Color(rgbCode,rgbCode,rgbCode,rgbCode));
      graphics.fillRect(startingPointX, startingPointY, 10, 10);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 320));
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

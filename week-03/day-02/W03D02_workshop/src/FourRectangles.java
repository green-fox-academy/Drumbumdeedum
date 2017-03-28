import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.

    graphics.setColor(new Color(0,255,0,150));
    graphics.fillRect(20, 20, 30, 40);

    graphics.setColor(new Color(255,255,0,150));
    graphics.fillRect(20, 100, 20, 50);

    graphics.setColor(new Color(0,255,255,150));
    graphics.fillRect(100, 20, 50, 20);

    graphics.setColor(new Color(10,25,255,150));
    graphics.fillRect(100, 100, 50, 80);

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

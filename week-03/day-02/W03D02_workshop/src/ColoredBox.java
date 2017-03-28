import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.
    graphics.setColor(new Color(255,0,0,150));
    graphics.drawLine(40, 50, 260, 50);

    graphics.setColor(new Color(0,255,0,150));
    graphics.drawLine(260, 50, 260, 270);

    graphics.setColor(new Color(0,0,255,150));
    graphics.drawLine(260, 270, 40, 270);

    graphics.setColor(new Color(0,255,255,150));
    graphics.drawLine(40, 270, 40, 50);

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


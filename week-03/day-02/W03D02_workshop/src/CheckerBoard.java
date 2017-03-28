import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.

    /*for (int i=0; i < 8; i +=2) {
      graphics.setColor(new Color(0, 0, 0, 255));
      graphics.fillRect(40 * i, 40*i, 40, 40);

      graphics.setColor(new Color(0, 0, 0, 255));
      graphics.fillRect(40 * (i+1), 40*(i+1), 40, 40);
    }*/


    for (int i=0; i < 8; i +=2) {
      graphics.setColor(new Color(0,0,0, 255));
      graphics.fillRect(40*i, 0, 40 , 40);
    }
    for (int i=0; i < 8; i +=2) {
      graphics.setColor(new Color(0,0,0, 255));
      graphics.fillRect(40*(i+1), 40, 40 , 40);
    }
    for (int i=0; i < 8; i +=2) {
      graphics.setColor(new Color(0,0,0, 255));
      graphics.fillRect(40*i, 80, 40 , 40);
    }
    for (int i=0; i < 8; i +=2) {
      graphics.setColor(new Color(0,0,0, 255));
      graphics.fillRect(40*(i+1), 120, 40 , 40);
    }
    for (int i=0; i < 8; i +=2) {
      graphics.setColor(new Color(0,0,0, 255));
      graphics.fillRect(40*i, 160, 40 , 40);
    }
    for (int i=0; i < 8; i +=2) {
      graphics.setColor(new Color(0,0,0, 255));
      graphics.fillRect(40*(i+1), 200, 40 , 40);
    }
    for (int i=0; i < 8; i +=2) {
      graphics.setColor(new Color(0,0,0, 255));
      graphics.fillRect(40*i, 240, 40 , 40);
    }
    for (int i=0; i < 8; i +=2) {
      graphics.setColor(new Color(0,0,0, 255));
      graphics.fillRect(40*(i+1), 280, 40 , 40);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 320));
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

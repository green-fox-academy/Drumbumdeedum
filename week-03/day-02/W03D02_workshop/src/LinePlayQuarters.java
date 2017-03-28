import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics){
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

    graphics.drawLine(150, 0, 150, 300);
    graphics.drawLine(0, 150, 300, 150);
    graphics.drawLine(0, 0, 300, 0);
    graphics.drawLine(300, 0, 300, 300);
    graphics.drawLine(300, 300, 0, 300);
    graphics.drawLine(0, 300, 0, 0);
    
    for (int i=0; i < 150; i+=15) {
      graphics.setColor(new Color(255,0,0,150));
      graphics.drawLine(0+i, 0,150, 0+i);
      graphics.setColor(new Color(10,10,100,150));
      graphics.drawLine(0, 0+i,0+i, 150);

      graphics.setColor(new Color(255,0,0,150));
      graphics.drawLine(150+i, 0,300, 0+i);
      graphics.setColor(new Color(10,10,100,150));
      graphics.drawLine(150, 0+i,150+i, 150);

      graphics.setColor(new Color(255,0,0,150));
      graphics.drawLine(0+i, 150,150, 150+i);
      graphics.setColor(new Color(10,10,100,150));
      graphics.drawLine(0, 150+i,0+i, 300);

      graphics.setColor(new Color(255,0,0,150));
      graphics.drawLine(150+i, 150,300, 150+i);
      graphics.setColor(new Color(10,10,100,150));
      graphics.drawLine(150, 150+i,150+i, 300);
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

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {

  public static void mainDraw(Graphics graphics){
    
    int startXY = 10;
    int baseSize = 0;

    for (int i=0; i < 6; i++) {
      baseSize += 10;
      purpleBox(startXY, baseSize, graphics);
      startXY += baseSize;
    }
  }

  public static void purpleBox (int input1, int input2, Graphics graphics) {
    graphics.setColor(new Color(75,0,130, 150));
    graphics.fillRect(input1, input1, input2 , input2);
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

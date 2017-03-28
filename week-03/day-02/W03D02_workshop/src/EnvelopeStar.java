import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics){
    graphics.setColor(new Color(10,255,100,150));
    graphics.drawLine(150, 0, 150, 300);
    graphics.drawLine(0, 150, 300, 150);

    for (int i=0; i < 150; i+=10) {
      graphics.setColor(new Color(10,255,100,150));
      graphics.drawLine( 0+i, 150, 150, 150-i);
      graphics.drawLine( 150, 0+i, 150+i, 150);
      graphics.drawLine( 150, 150+i, 300-i, 150);
      graphics.drawLine( 0+i, 150, 150, 150+i);

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


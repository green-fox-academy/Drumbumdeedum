import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  public static void mainDraw(Graphics graphics){


    for (int i=1; i < 18; i++) {
      purpleBox(i*10,graphics);
    }

  }

  public static void purpleBox (int input, Graphics graphics) {
    graphics.setColor(new Color(75,0,130, 150));
    graphics.fillRect(input, input, 10 , 10);
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
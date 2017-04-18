import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RecursiveSquares {
    public static void mainDraw(Graphics g){
      g.setColor(new Color(255,255,0,255));
      g.fillRect(0, 0, 600, 600);
      g.setColor(new Color(0,0,0,255));
      g.drawRect(0, 0, 600, 600);

      lines(0,0,600, g);

      fractalize(0,0,600, g);
    }

    public static void lines (int x, int y, int maxLine, Graphics g) {
      g.drawLine(x + maxLine/3, y, x + maxLine/3, y + maxLine);
      g.drawLine(x + maxLine/3*2, y,x + maxLine/3*2, y + maxLine);
      g.drawLine(x + 0,y + maxLine/3, x + maxLine, y + maxLine/3);
      g.drawLine(x + 0,y + maxLine/3*2, x + maxLine, y + maxLine/3*2);
    }

    public static void fractalize(int x, int y, int maxLine, Graphics g) {
      if (maxLine < 1) {
        return;
      } else {
        lines(x, y, maxLine, g);
        fractalize(x + (maxLine / 3), y, maxLine / 3, g);
        fractalize(x, y + (maxLine / 3), maxLine / 3, g);
        fractalize(x + ((maxLine / 3) * 2), y + (maxLine / 3), maxLine / 3, g);
        fractalize(x + (maxLine / 3), y + ((maxLine / 3) * 2), maxLine / 3, g);
      }
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

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RecursiveSquares {
    public static void mainDraw(Graphics graphics){
      graphics.setColor(new Color(255,255,0,255));
      graphics.fillRect(0, 0, 600, 600);
      graphics.setColor(new Color(0,0,0,255));
      graphics.drawRect(0, 0, 600, 600);


      fractals(0,0,600, graphics);
    }

    public static void lines (int x, int y, int maxLine, Graphics graphics) {
      graphics.drawLine(x + maxLine/3, y, x + maxLine/3, y + maxLine);
      graphics.drawLine(x + maxLine/3*2, y,x + maxLine/3*2, y + maxLine);
      graphics.drawLine(x + 0,y + maxLine/3, x + maxLine, y + maxLine/3);
      graphics.drawLine(x + 0,y + maxLine/3*2, x + maxLine, y + maxLine/3*2);
    }

    public static void fractals(int x, int y, int maxLine, Graphics graphics) {
      if (maxLine < 1) {
        return;
      } else {
        lines(x, y, maxLine, graphics);
        fractals(x + (maxLine / 3), y, maxLine / 3, graphics);
        fractals(x, y + (maxLine / 3), maxLine / 3, graphics);
        fractals(x + ((maxLine / 3) * 2), y + (maxLine / 3), maxLine / 3, graphics);
        fractals(x + (maxLine / 3), y + ((maxLine / 3) * 2), maxLine / 3, graphics);
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

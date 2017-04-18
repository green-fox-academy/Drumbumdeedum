import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.

    int tileSize = 20;
    int rowsAndColumns = 16;

    for (int j=0; j < tileSize*rowsAndColumns; j+=tileSize*2) {

      for (int i = 0; i < rowsAndColumns; i += 2) {
        graphics.setColor(new Color(0, 0, 0, 255));
        graphics.fillRect(tileSize * i, j, tileSize, tileSize);
      }
      for (int i = 0; i < rowsAndColumns; i += 2) {
        graphics.setColor(new Color(0, 0, 0, 255));
        graphics.fillRect(tileSize * (i + 1), j+tileSize, tileSize, tileSize);
      }
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 340));
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

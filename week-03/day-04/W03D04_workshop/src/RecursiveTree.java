import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Polygon;

public class RecursiveTree {

  public static void mainDraw(Graphics g) {


    //drawTree(400,400 400, 10, g);
  }

  /*public static void drawTree(double startX, double length, int branches, Graphics g) {
    Polygon p = new Polygon();
    p.addPoint((int)startX, (int)startX);
    p.addPoint((int)startX, (int)startX-(int)length);
    g.drawPolygon(p);

    if (branches > 0) {
      drawTree(startX,);
    }


  }*/



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

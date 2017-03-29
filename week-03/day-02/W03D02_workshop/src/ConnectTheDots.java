import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static void mainDraw(Graphics graphics){
    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box:
    // connect these:
    // {10, 10, 290,  10, 290, 290, 10, 290}
    // {50, 100, 70, 70, 80, 90, 90, 90, 100, 70}
    // {120, 100, 85, 130, 50, 100}

    // input ArrayList
    ArrayList<Integer> dots = new ArrayList<>();

    int[] numbers = {50, 100, 70, 70, 80, 90, 90, 90, 100, 70};

    for (int i=0; i < numbers.length; i++) {
      dots.add(i, numbers[i]);
    }
    dots.add(dots.size(), dots.get(0));
    dots.add(dots.size(), dots.get(1));

    connectTheDots(dots, graphics);
  }

  public static void connectTheDots (ArrayList <Integer> input, Graphics graphics) {

    for (int i=0; i < input.size()-2; i += 2) {
      graphics.drawLine(input.get(0+i), input.get(1+i), input.get(2+i), input.get(3+i));
    }
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


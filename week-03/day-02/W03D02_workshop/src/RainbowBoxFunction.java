import java.util.HashMap;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

    String Violet = "148,0,211";
    String Indigo = "75,0,130";
    String Blue = "0,0,255";
    String Green = "0,255,0";
    String Yellow = "255,255,0";
    String Orange = "255,127,0";
    String Red = "255,0,0";

    HashMap <Integer, String> colorMap = new HashMap<>();
    colorMap.put(1, Violet);
    colorMap.put(2, Indigo);
    colorMap.put(3, Blue);
    colorMap.put(4, Green);
    colorMap.put(5, Yellow);
    colorMap.put(6, Orange);
    colorMap.put(7, Red);
    colorMap.put(8, Violet);
    colorMap.put(9, Indigo);
    colorMap.put(10, Blue);

    for (int i=10; i > 0; i--) {
      drawRainbowSquare(i*30, colorMap.get(i), graphics);
    }
  }

  public static void drawRainbowSquare (int input, String inputColor, Graphics graphics) {

    int startingPoint = 150-input/2;

    int firstComma = inputColor.indexOf(",");
    int secondComma = inputColor.indexOf(",", firstComma+1);

    String firstValueString = inputColor.substring(0, firstComma);
    String secondValueString = inputColor.substring(firstComma+1, secondComma);
    String thirdValueString = inputColor.substring(secondComma+1);

    int firstValue = Integer.parseInt(firstValueString);
    int secondValue = Integer.parseInt(secondValueString);
    int thirdValue = Integer.parseInt(thirdValueString);

    int colorR = firstValue;
    int colorG = secondValue;
    int colorB = thirdValue;

    graphics.setColor(new Color(colorR, colorG, colorB, 150));
    graphics.fillRect(startingPoint, startingPoint, input, input);
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

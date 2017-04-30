import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GameObject {

  final static int SIZE = 72;
  BufferedImage image;
  int locX, locY;
  String type;

  public void drawGameObject(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, locX * SIZE, locY * SIZE, null);
    }
  }
}

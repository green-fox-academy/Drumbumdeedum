import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GameObject {
  final static int SIZE = 72;
  BufferedImage image;
  int locX, locY, mapID;

  public GameObject() {

  }

  public void drawGameObject(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, locX * SIZE, locY * SIZE, null);
    }
  }

  public void setImage(BufferedImage image) {
    this.image = image;
  }

  public int getLocX() {
    return this.locX;
  }

  public int getLocY() {
    return this.locY;
  }

  public int setLocX(int x) {
    return this.locX = x;
  }

  public int setLocY(int y) {
    return this.locY = y;
  }
}

import java.awt.Graphics;

public class Models {
  String filename;
  int locX;
  int locY;

  public void draw(Graphics graphics) {
    PositionedImage image = new PositionedImage(filename, locX, locY);
    image.draw(graphics);
  }
}

import java.awt.Graphics;

public class Characters extends GameObject{
  int HP, DP, SP;
  String currentStats;
  RandomNumber dice = new RandomNumber();

  public boolean isAlive() {
    if (this.HP >= 1) {
      return true;
    } else {
      return false;
    }
  }

  public void drawCharacter(Graphics graphics) {
    if (image != null && this.isAlive()) {
      graphics.drawImage(image, locX * SIZE, locY * SIZE, null);
    }
  }
}

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Character extends GameObject {
  Dice dice = new Dice();
  int level, HP, DP, SP, maxHP, maxDP, maxSP;
  String currentStats;

  public int getLocX() {
    return this.locX;
  }

  public int getLocY() {
    return this.locY;
  }

  public void setLocX(int x) {
    this.locX = this.locX + x;
  }

  public void setLocY(int y) {
    this.locY = this.locY + y;
  }

  public void setImage(BufferedImage image) {
    this.image = image;
  }

  public boolean isAlive(){
    if (this.HP > 0) {
      return true;
    } else {
      return false;
    }
  }
}

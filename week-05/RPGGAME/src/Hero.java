import java.awt.Graphics;

/**
 * Created by danielszalay on 2017. 04. 10..
 */
public class Hero {
  int heroStartX;
  int heroStartY;

  public Hero() {
    heroStartX = 0;
    heroStartY = 0;
  }

  public void addHeroToMap(Graphics graphics) {
    PositionedImage hero1 = new PositionedImage("assets/hero-down.png", heroStartX, heroStartY);
    hero1.draw(graphics);
  }

  public void moveHero() {

  }
}

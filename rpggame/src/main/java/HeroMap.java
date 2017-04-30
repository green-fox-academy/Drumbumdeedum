import java.awt.Graphics;
import java.util.ArrayList;

public class HeroMap {
  ArrayList<Hero> heroMap;

  public HeroMap() {
    heroMap = new ArrayList<>();
  }

  public void drawHero(Graphics g) {
    for (int i=0; i < this.heroMap.size(); i++) {
      this.heroMap.get(i).drawGameObject(g);
    }
  }

  public void addHero(Hero hero) {
    this.heroMap.add(hero);
  }
}

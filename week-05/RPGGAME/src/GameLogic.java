import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class GameLogic {

  final static int ONE_STEP = 1;
  final static int MAP_TILES = 10;

  Hero newHero;
  GameArea wallMap;
  Hud newHud;

  public GameLogic() {
    wallMap = new GameArea();
    newHud = new Hud();
    newHero = new Hero();

    int numberOfSkeletons = 0;
    int randomLocX = (int)(Math.random()*9);
    int randomLocY = (int)(Math.random()*9);
    while (numberOfSkeletons < 3) {
      if (wallMap.newGameArea[randomLocX][randomLocY] != 0) {
        randomLocX = (int)(Math.random()*9);
        randomLocY = (int)(Math.random()*9);
      } else if (wallMap.newGameArea[randomLocX][randomLocY] == 0) {
        wallMap.newGameArea[randomLocX][randomLocY] = 4;
        numberOfSkeletons ++;
      }
    }

    int bossNr = 0;
    while (bossNr < 1) {
      if (wallMap.newGameArea[randomLocX][randomLocY] != 0) {
        randomLocX = (int)(Math.random()*9);
        randomLocY = (int)(Math.random()*9);
      } else if (wallMap.newGameArea[randomLocX][randomLocY] == 0) {
        wallMap.newGameArea[randomLocX][randomLocY] = 3;
        bossNr ++;
      }
    }
  }

  public void start(Graphics graphics) {
    wallMap.drawArea(graphics);
    newHero.drawCharacter(graphics);
    newHud.drawHud(graphics,0, Hud.SIZE, newHero);
  }

  public void movement(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (newHero.locY >= ONE_STEP && !wallMap.isWall(newHero.locX, newHero.locY - ONE_STEP)) {
        newHero.locY--;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_UP);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (newHero.locY < MAP_TILES - ONE_STEP && !wallMap
          .isWall(newHero.locX, newHero.locY + ONE_STEP)) {
        newHero.locY++;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_DOWN);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (newHero.locX >= ONE_STEP && !wallMap.isWall(newHero.locX - ONE_STEP, newHero.locY)) {
        newHero.locX--;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_LEFT);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (newHero.locX < MAP_TILES - ONE_STEP && !wallMap
          .isWall(newHero.locX + ONE_STEP, newHero.locY)) {
        newHero.locX++;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_RIGHT);
    }
  }
}

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class App extends JComponent implements KeyListener {
  final static int MAP_SIZE = 720;
  final static int ONE_STEP = 1;
  final static int MAP_TILES = 10;
  GameArea newMap;
  Hero newHero;

  public App() {
    setPreferredSize(new Dimension(MAP_SIZE, MAP_SIZE));
    setVisible(true);
    newMap = new GameArea();
    newHero = new Hero();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    newMap.drawArea(graphics);
    newHero.drawGameObject(graphics);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    App board = new App();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }
  @Override
  public void keyPressed(KeyEvent e) {

  }
  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (newHero.locY >= ONE_STEP && !newMap.isWall(newHero.locX, newHero.locY - ONE_STEP)) {
        newHero.locY --;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_UP);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (newHero.locY < MAP_TILES - ONE_STEP && !newMap.isWall(newHero.locX, newHero.locY + ONE_STEP)) {
        newHero.locY ++;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_DOWN);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (newHero.locX >= ONE_STEP && !newMap.isWall(newHero.locX - ONE_STEP, newHero.locY)) {
        newHero.locX --;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_LEFT);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (newHero.locX < MAP_TILES - ONE_STEP && !newMap.isWall(newHero.locX + ONE_STEP, newHero.locY)) {
        newHero.locX ++;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_RIGHT);
    }
    invalidate();
    repaint();
  }
}
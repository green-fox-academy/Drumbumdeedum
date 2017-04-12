import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class App extends JComponent implements KeyListener {
  final static int MAPSIZE = 720;
  final static int ONESTEP = 1;
  final static int MAPTILES = 10;
  GameArea newMap;
  Hero newHero;

  public App() {
    setPreferredSize(new Dimension(MAPSIZE, MAPSIZE));
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
      if (newHero.locY >= ONESTEP && newMap.checkObject(newHero.locX, newHero.locY - ONESTEP)) {
        newHero.locY --;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_UP);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (newHero.locY < MAPTILES - ONESTEP && newMap.checkObject(newHero.locX, newHero.locY + ONESTEP)) {
        newHero.locY ++;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_DOWN);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (newHero.locX >= ONESTEP && newMap.checkObject(newHero.locX - ONESTEP, newHero.locY)) {
        newHero.locX --;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_LEFT);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (newHero.locX < MAPTILES - ONESTEP && newMap.checkObject(newHero.locX + ONESTEP, newHero.locY)) {
        newHero.locX ++;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_RIGHT);
    }
    invalidate();
    repaint();
  }
}

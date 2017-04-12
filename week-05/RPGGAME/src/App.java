import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class App extends JComponent implements KeyListener {
  final static int SIZE = 72;
  final static int MAPSIZE = 720;
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
      if (newHero.locY >= SIZE) {
        newHero.locY -= SIZE;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_UP);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (newHero.locY < MAPSIZE - SIZE) {
        newHero.locY += SIZE;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_DOWN);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (newHero.locX >= SIZE) {
        newHero.locX -= SIZE;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_LEFT);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (newHero.locX < MAPSIZE - SIZE) {
        newHero.locX += SIZE;
      }
      newHero.setImage(ImageLoader.getInstance().HERO_RIGHT);
    }
    invalidate();
    repaint();
  }
}

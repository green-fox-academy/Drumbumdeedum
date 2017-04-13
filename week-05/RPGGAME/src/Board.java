import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {

  final static int MAP_SIZE = 720;
  final static int HUD_SIZE = 110;
  GameLogic newGame;


  public Board() {
    setPreferredSize(new Dimension(MAP_SIZE, MAP_SIZE + HUD_SIZE));
    setVisible(true);
    newGame = new GameLogic();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    newGame.start(graphics);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    newGame.movement(e);
    invalidate();
    repaint();
  }
}

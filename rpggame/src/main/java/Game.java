import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Game extends JComponent implements KeyListener {

  public final int MAP_ROWS = 10;
  public final int MAP_COLUMNS = 20;
  public final int TILE_SIZE = 72;
  public final int MAP_WIDTH = MAP_COLUMNS * TILE_SIZE;
  public final int MAP_HEIGHT = MAP_ROWS * TILE_SIZE;
  public final int HUD_SIZE = 130;

  Board gameBoard;

  public Game() {
    setPreferredSize(new Dimension(MAP_WIDTH, MAP_HEIGHT + HUD_SIZE));
    setVisible(true);
    gameBoard = new Board(MAP_ROWS, MAP_COLUMNS);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    gameBoard.draw(graphics, MAP_WIDTH, MAP_HEIGHT, HUD_SIZE, gameBoard.newHero);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    gameBoard.update(e);
    invalidate();
    repaint();
  }
}

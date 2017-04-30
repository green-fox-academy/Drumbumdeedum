import javax.swing.JFrame;

public class App {

  public static void main(String[] args) {

    JFrame frame = new JFrame("RPG Game");
    Game newGame = new Game();
    frame.add(newGame);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(newGame);
  }
}

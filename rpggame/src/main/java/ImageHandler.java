import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageHandler {

  private static ImageHandler instance;
  public BufferedImage FLOOR, WALL, HERO_UP, HERO_DOWN, HERO_LEFT, HERO_RIGHT, BOSS, SKELETON, DEMON, DRAGON, ORC, SENTINEL, TROLL, WARLOCK, HEART, KISCICA;

  private ImageHandler() {
    try {
      String heroType = "dani";

      if (!heroType.equals("dani")) {
        HERO_UP = ImageIO.read(new File("assets/hero-up.png"));
        HERO_DOWN = ImageIO.read(new File("assets/hero-down.png"));
        HERO_LEFT = ImageIO.read(new File("assets/hero-left.png"));
        HERO_RIGHT = ImageIO.read(new File("assets/hero-right.png"));
      }
      if (heroType.equals("dani")) {
        HERO_UP = ImageIO.read(new File("assets/nyanyi.png"));
        HERO_DOWN = ImageIO.read(new File("assets/nyanyi.png"));
        HERO_LEFT = ImageIO.read(new File("assets/nyanyi.png"));
        HERO_RIGHT = ImageIO.read(new File("assets/nyanyi.png"));
      }

      FLOOR = ImageIO.read(new File("assets/floor.png"));
      WALL = ImageIO.read(new File("assets/wall.png"));
      BOSS = ImageIO.read(new File("assets/boss.png"));
      SKELETON = ImageIO.read(new File("assets/skeleton.png"));
      HEART = ImageIO.read(new File("assets/heart.png"));
      KISCICA = ImageIO.read(new File("assets/kiscica.png"));
      DEMON = ImageIO.read(new File("assets/demon.png"));
      DRAGON = ImageIO.read(new File("assets/dragon.png"));
      ORC = ImageIO.read(new File("assets/orc.png"));
      SENTINEL = ImageIO.read(new File("assets/sentinel.png"));
      TROLL = ImageIO.read(new File("assets/troll.png"));
      WARLOCK = ImageIO.read(new File("assets/warlock.png"));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static ImageHandler getInstance() {
    if (instance == null) {
      instance = new ImageHandler();
    }
    return instance;
  }
}

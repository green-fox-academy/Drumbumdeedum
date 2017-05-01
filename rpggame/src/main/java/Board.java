import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Board {

  RandomMap randomMap;
  CharacterMap characterMap;
  HUD newHUD;
  HeroMap heroMap;
  Hero newHero;
  Dice dice;
  int level = 1;

  public Board(int row, int column) {
    randomMap = new RandomMap(column);
    randomMap.createRandomMap(row, column);
    //randomMap.countTiles();

    characterMap = new CharacterMap();
    characterMap.fillCharacterList(column, row, randomMap, level);

    heroMap = new HeroMap();
    newHero = new Hero(0,0, level);
    heroMap.addHero(newHero);

    newHUD = new HUD();
    dice = new Dice();
  }

  public void draw(Graphics g, int width, int height, int hud, Hero hero) {
    randomMap.drawMap(g);
    heroMap.drawHero(g);
    characterMap.drawCharacters(g);
    newHUD.drawHud(g, 0, height, width, hud, hero, characterMap);
  }

  public void update(KeyEvent e) {
    if (heroMap.heroMap.size() > 0) {
      if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        heroMap.heroMap.get(0).actionsTaken += 1;
        heroMap.heroMap.get(0).setImage(ImageHandler.getInstance().HERO_RIGHT);
        if (!randomMap
            .isWallTile(heroMap.heroMap.get(0).getLocX() + 1, heroMap.heroMap.get(0).getLocY())
            && heroMap.heroMap.get(0).getLocX() + 1 < randomMap.tileMap.size()) {
          heroMap.heroMap.get(0).setLocX(1);
        }
      }
      if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        heroMap.heroMap.get(0).actionsTaken += 1;
        heroMap.heroMap.get(0).setImage(ImageHandler.getInstance().HERO_LEFT);
        if (!randomMap.isWallTile(heroMap.heroMap.get(0).getLocX() - 1, heroMap.heroMap.get(0).getLocY())
            && heroMap.heroMap.get(0).getLocX() - 1 >= 0) {
          heroMap.heroMap.get(0).setLocX(-1);
        }
      }
      if (e.getKeyCode() == KeyEvent.VK_UP) {
        heroMap.heroMap.get(0).actionsTaken += 1;
        heroMap.heroMap.get(0).setImage(ImageHandler.getInstance().HERO_UP);
        if (!randomMap.isWallTile(heroMap.heroMap.get(0).getLocX(), heroMap.heroMap.get(0).getLocY() - 1)
            && heroMap.heroMap.get(0).getLocY() - 1 >= 0) {
          heroMap.heroMap.get(0).setLocY(-1);
        }
      }
      if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        heroMap.heroMap.get(0).actionsTaken += 1;
        heroMap.heroMap.get(0).setImage(ImageHandler.getInstance().HERO_DOWN);
        if (!randomMap
            .isWallTile(heroMap.heroMap.get(0).getLocX(), heroMap.heroMap.get(0).getLocY() + 1)
            && heroMap.heroMap.get(0).getLocY() + 1 < randomMap.tileMap.get(heroMap.heroMap.get(0).getLocY()).size()) {
          heroMap.heroMap.get(0).setLocY(1);
        }
      }
      if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_UP
          || e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT) {
        for (Character monster : characterMap.characterList) {
          int random = (int) (Math.random() * 4);
          if (randomMap.isFloorTile(monster.getLocX() - 1, monster.getLocY()) && random == 0
              && heroMap.heroMap.get(0).actionsTaken % 2 == 0 && isEmpty(
              characterMap.characterList, monster.getLocX() - 1, monster.getLocY())) {
            monster.setLocX(-1);
          }
          if (randomMap.isFloorTile(monster.getLocX() + 1, monster.getLocY()) && random == 1
              && heroMap.heroMap.get(0).actionsTaken % 2 == 0 && isEmpty(
              characterMap.characterList, monster.getLocX() + 1, monster.getLocY())) {
            monster.setLocX(1);
          }
          if (randomMap.isFloorTile(monster.getLocX(), monster.getLocY() + 1) && random == 2
              && heroMap.heroMap.get(0).actionsTaken % 2 == 0 && isEmpty(characterMap.characterList,
              monster.getLocX(), monster.getLocY() + 1)) {
            monster.setLocY(1);
          }
          if (randomMap.isFloorTile(monster.getLocX(), monster.getLocY() - 1) && random == 3
              && heroMap.heroMap.get(0).actionsTaken % 2 == 0 && isEmpty(characterMap.characterList,
              monster.getLocX(), monster.getLocY() - 1)) {
            monster.setLocY(-1);
          }
        }
      }
      if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        for (int i = 0; i < characterMap.characterList.size(); i++) {
          if (characterMap.characterList.get(i).getLocX() == heroMap.heroMap.get(0).getLocX() && characterMap.characterList.get(i).getLocY() == heroMap.heroMap.get(0).getLocY()) {
            battle(heroMap, characterMap.characterList.get(i));
          }
        }
      }
    } else {
      if (e.getKeyCode() == KeyEvent.CHAR_UNDEFINED) {
        System.out.println("Hero is dead, start a new game!");
      }
    }
  }

  public void strike(Character attacker, Character target) {
    int strikeValue = attacker.SP + dice.D6() * 2;

    if (strikeValue > target.DP) {
      target.HP = target.HP - strikeValue;
    }
  }

  public void battle(HeroMap hero, Character monster) {
    if (monster.type.equals("Kiscica")) {
      randomMap.addHeart(heroMap.heroMap.get(0).getLocX(), heroMap.heroMap.get(0).getLocY());
      strike(hero.heroMap.get(0), monster);
      die(monster);
    } else if (!monster.type.equals("Kiscica")) {
      strike(hero.heroMap.get(0), monster);
      if (monster.isAlive()) {
        strike(monster, hero.heroMap.get(0));
      }
      die(monster);
      dieHero(hero);
    }
  }

  public void die(Character target) {
    if (target.HP <= 0) {
      characterMap.characterList.remove(target);
    }
  }

  public void dieHero(HeroMap hero) {
    if (hero.heroMap.get(0).HP <= 0) {
      hero.heroMap.remove(0);
    }
  }

  public boolean isEmpty (ArrayList<Character> characterList, int x, int y) {
    boolean isEmpty = true;
    for (int i=0; i < characterList.size(); i++) {
      if (characterList.get(i).getLocX() == x && characterList.get(i).getLocY() == y) {
        isEmpty = false;
      }
    }
    return isEmpty;
  }
}

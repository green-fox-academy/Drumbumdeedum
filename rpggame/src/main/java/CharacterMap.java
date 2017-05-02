import java.awt.Graphics;
import java.util.ArrayList;

public class CharacterMap {
  ArrayList<Character> characterList;

  public CharacterMap() {
    characterList = new ArrayList<>();
  }

  public void drawCharacters(Graphics g) {
    for (int i=0; i < this.characterList.size(); i++) {
      this.characterList.get(i).drawGameObject(g);
    }
  }

  public void fillCharacterList(int columns, int rows, RandomMap map, int level) {
    int nrOfSkeletons = 0;
    int nrOfBoss = 0;
    int nrOfKiscica= 0;
    int nrOfDemon = 0;
    int nrOfDragon = 0;
    int nrOfOrc = 0;
    int nrOfSentinel = 0;
    int nrOfTroll = 0;
    int nrOfWarlock = 0;

    while (nrOfSkeletons < 1) {
      int randomX = (int) (Math.random() * (columns - 4) + 3);
      int randomY = (int) (Math.random() * (rows - 4) + 3);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Skeleton(randomX, randomY, level));
        nrOfSkeletons++;
      }
    }

    while (nrOfBoss < 1) {
      int randomX = (int) (Math.random() * columns / 2 - 1 + columns / 2);
      int randomY = (int) (Math.random() * rows / 2 - 1 + rows / 2);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Boss(randomX, randomY, level));
        nrOfBoss++;
      }
    }

    while (nrOfKiscica < 1) {
      int randomX = (int) (Math.random() * columns / 2 - 1 + columns / 2);
      int randomY = (int) (Math.random() * rows / 2 - 1 + rows / 2);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Kiscica(randomX, randomY));
        nrOfKiscica++;
      }
    }

    while (nrOfDemon < 1) {
      int randomX = (int) (Math.random() * columns / 2 - 1 + columns / 2);
      int randomY = (int) (Math.random() * rows / 2 - 1 + rows / 2);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Demon(randomX, randomY, level));
        nrOfDemon++;
      }
    }

    while (nrOfDragon < 1) {
      int randomX = (int) (Math.random() * columns / 2 - 1 + columns / 2);
      int randomY = (int) (Math.random() * rows / 2 - 1 + rows / 2);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Dragon(randomX, randomY, level));
        nrOfDragon++;
      }
    }

    while (nrOfOrc < 1) {
      int randomX = (int) (Math.random() * columns / 2 - 1 + columns / 2);
      int randomY = (int) (Math.random() * rows / 2 - 1 + rows / 2);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Orc(randomX, randomY, level));
        nrOfOrc++;
      }
    }

    while (nrOfSentinel < 1) {
      int randomX = (int) (Math.random() * columns / 2 - 1 + columns / 2);
      int randomY = (int) (Math.random() * rows / 2 - 1 + rows / 2);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Sentinel(randomX, randomY, level));
        nrOfSentinel++;
      }
    }

    while (nrOfSkeletons < 1) {
      int randomX = (int) (Math.random() * columns / 2 - 1 + columns / 2);
      int randomY = (int) (Math.random() * rows / 2 - 1 + rows / 2);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Skeleton(randomX, randomY, level));
        nrOfSkeletons++;
      }
    }

    while (nrOfTroll < 1) {
      int randomX = (int) (Math.random() * columns / 2 - 1 + columns / 2);
      int randomY = (int) (Math.random() * rows / 2 - 1 + rows / 2);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Troll(randomX, randomY, level));
        nrOfTroll++;
      }
    }

    while (nrOfWarlock < 1) {
      int randomX = (int) (Math.random() * columns / 2 - 1 + columns / 2);
      int randomY = (int) (Math.random() * rows / 2 - 1 + rows / 2);
      if (map.isFloorTile(randomX, randomY) && isEmpty(this.characterList, randomX, randomY)) {
        this.characterList.add(new Warlock(randomX, randomY, level));
        nrOfWarlock++;
      }
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

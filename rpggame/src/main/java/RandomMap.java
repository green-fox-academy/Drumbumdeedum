import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class RandomMap {

  List<List<Tile>> tileMap = new ArrayList<>();

  public RandomMap(int rows) {

    tileMap = new ArrayList<>();

    for (int i=0; i < rows; i++) {
      tileMap.add(new ArrayList<>());
    }
  }

  public void addFloorTile(int x, int y) {
    this.tileMap.get(x).add(y, new Floor(x,y));
  }

  public void addWallTile(int x, int y) {
    this.tileMap.get(x).add(new Wall(x,y));
  }

  public void addHeart(int x, int y) {
    this.tileMap.get(x).add(new Heart(x,y));
  }

  public void removeTile(int x, int y) {
    this.tileMap.get(x).remove(y);
  }

  public boolean isFloorTile(int x, int y) {
    if (x >= 0 && x < this.tileMap.size() && y >=0 && y < this.tileMap.get(x).size()) {
      return this.tileMap.get(x).get(y).type == "Floor";
    } else {
      return false;
    }
  }

  public boolean isWallTile(int x, int y) {
    if (x >= 0 && x < this.tileMap.size() && y >=0 && y < this.tileMap.get(x).size()) {
      return this.tileMap.get(x).get(y).type == "Wall";
    } else {
      return false;
    }
  }

  public void replaceWithFloor (int x, int y) {
    removeTile(x, y);
    addFloorTile(x, y);
  }

  public int countSurroundingFloorTiles(int x, int y) {
    int nrOfFloorTiles = 0;

    if (isWallTile(x, y)) {
        if (isFloorTile(x - 1,y)) {
          nrOfFloorTiles ++;
        }
        if (isFloorTile(x - 1,y - 1)) {
          nrOfFloorTiles ++;
        }
        if (isFloorTile(x + 1,y)) {
          nrOfFloorTiles ++;
        }
        if (isFloorTile(x + 1,y + 1)) {
          nrOfFloorTiles ++;
        }
        if (isFloorTile(x,y - 1)) {
          nrOfFloorTiles ++;
        }
        if (isFloorTile(x + 1,y - 1)) {
          nrOfFloorTiles ++;
        }
        if (isFloorTile(x,y + 1)) {
          nrOfFloorTiles ++;
        }
        if (isFloorTile(x - 1,y + 1)) {
          nrOfFloorTiles++;
      }
    }
    return nrOfFloorTiles;
  }

  int neighborWallTiles(int x, int y) {
    int wallNeighbors = 0;

    if (isFloorTile(x, y)) {
      if (isWallTile(x, y + 1)) {
        wallNeighbors++;
      }
      if (isWallTile(x, y - 1)) {
        wallNeighbors++;
      }
      if (isWallTile(x + 1, y)) {
        wallNeighbors++;
      }
      if (isWallTile(x - 1, y)) {
        wallNeighbors++;
      }
    }
    return wallNeighbors;
  }

  public void createRandomMap(int rows, int columns) {
    for (int i=0; i < columns; i++) {
      for (int j=0; j < rows; j++) {
        int random = (int)(Math.random() * 4);
        if (random == 0) {
          addFloorTile(i, j);
        } else {
          addWallTile(i, j);
        }
      }
    }
    for (int i = 0; i < columns; i++) {
      replaceWithFloor(i,0);
      replaceWithFloor(i,rows-1);
    }
    for (int i = 0; i < rows; i++) {
      replaceWithFloor(0,i);
      replaceWithFloor(columns-1,i);
    }
    for (int i = 1; i < columns-1; i++) {
      for (int j = 1; j < rows-1; j++) {
        if (countSurroundingFloorTiles(i,j) <= 2) {
          replaceWithFloor(i,j);
        }
      }
    }
    for (int i = 1; i < columns-1; i++) {
      for (int j = 1; j < rows-1; j++) {
        if (neighborWallTiles(i, j) > 2) {
          if (isWallTile(i+1,j)) {
            replaceWithFloor(i + 1, j);
          } else if (isWallTile(i-1,j)) {
            replaceWithFloor(i-1, j);
          } else if (isWallTile(i,j+1)) {
            replaceWithFloor(i, j+1);
          } else if (isWallTile(i,j-1)) {
            replaceWithFloor(i, j-1);
          }
        }
      }
    }
  }

  public void drawMap(Graphics graphics) {
    for (List<Tile> row : tileMap) {
      for (Tile tile : row) {
        tile.drawGameObject(graphics);
      }
    }
  }

  public void countTiles() {
    int nrOfFloorTiles = 0;
    int nrOfWallTiles = 0;

    for (int i = 0; i < this.tileMap.size(); i++) {
      for (int j = 0; j < this.tileMap.get(i).size(); j++) {
        if (this.tileMap.get(i).get(j).type.equals("Wall")) {
          nrOfWallTiles ++;
        } else if (this.tileMap.get(i).get(j).type.equals("Floor")) {
          nrOfFloorTiles ++;
        }
      }
    }
    System.out.println("Floor Tiles: " + nrOfFloorTiles);
    System.out.println("Wall Tiles: " + nrOfWallTiles);
  }
}

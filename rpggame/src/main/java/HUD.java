import java.awt.*;

public class HUD {

  public static void drawHud(Graphics g, int x, int y, int width, int height, Character hero, CharacterMap monstermap) {
    fillBackGround(g, x, y, height, width);
    g.setColor(Color.white);
    if (hero.isAlive() && !monstermap.isEmpty(monstermap.characterList, hero.getLocX(), hero.getLocY())) {
      int monsterID = 0;

      for (int i=0; i < monstermap.characterList.size(); i++) {
        if (hero.getLocX() == monstermap.characterList.get(i).getLocX() && hero.getLocY() == monstermap.characterList.get(i).getLocY() && monstermap.characterList.size() > 0) {
          monsterID = i;
        }
      }

      if (monstermap.characterList.get(monsterID).type.equals("Kiscica")) {
        g.drawString("Hero Level: " + hero.level, 15, y + 25);
        g.drawString("Health Points: " + hero.HP, 15, y + 40);
        g.drawString("Defense Points: " + hero.DP, 15, y + 55);
        g.drawString("Strike Points: " + hero.SP, 15, y + 70);

        g.drawString("SAVE ME BRAVE DANI!", 315, y + 25);
      } else {
        g.drawString("Hero Level: " + hero.level, 15, y + 25);
        g.drawString("Health Points: " + hero.HP, 15, y + 40);
        g.drawString("Defense Points: " + hero.DP, 15, y + 55);
        g.drawString("Strike Points: " + hero.SP, 15, y + 70);

        g.drawString("Monster type: " + monstermap.characterList.get(monsterID).type, 315, y + 25);
        g.drawString("Health Points: " + monstermap.characterList.get(monsterID).HP, 315, y + 40);
        g.drawString("Defense Points: " + monstermap.characterList.get(monsterID).DP, 315, y + 55);
        g.drawString("Strike Points: " + monstermap.characterList.get(monsterID).SP, 315, y + 70);
      }

      if (hero.HP <= 10) {
        g.drawString("Your health is low! Be careful!", 15, y + 85);
      }

    } else if (hero.isAlive() && monstermap.isEmpty(monstermap.characterList, hero.getLocX(), hero.getLocY()) && monstermap.characterList.size() > 0) {
      g.drawString("Hero Level: " + hero.level, 15, y + 25);
      g.drawString("Health Points: " + hero.HP, 15, y + 40);
      g.drawString("Defense Points: " + hero.DP, 15, y + 55);
      g.drawString("Strike Points: " + hero.SP, 15, y + 70);

      if (hero.HP <= 10) {
        g.drawString("Your health is low! Be careful!", 15, y + 85);
      }

    } else if (hero.isAlive() && monstermap.characterList.size() == 0) {
      g.drawString("LEVEL CLEARED!", width/2 - 40, y + 70);
    } else {
      g.drawString("YOUR HERO IS DEAD!", width/2 - 70, y + 60);
      g.drawString("GAME OVER!", width/2 - 40, y + 75);
    }
  }

  private static void fillBackGround(Graphics g, int startX, int startY, int height, int width) {
    g.setColor(Color.black);
    g.fillRect(startX+5, startY+5, width-10, height-10);
  }
}

public class Hero extends Characters{

  public Hero() {
    image = ImageLoader.getInstance().HERO_DOWN;
    mapID = 2;
    locX = 0;
    locY = 0;
    HP = 20 + 3 * (dice.ranNum(1, 6));
    DP = 2 * (dice.ranNum(1, 6));
    SP = 5 + (dice.ranNum(1, 6));
    currentStats = "Hero: Health points: " + Integer.toString(HP) +
        ", Defense points: " + Integer.toString(DP) +
        ", Strike points: " + Integer.toString(SP);
  }
}

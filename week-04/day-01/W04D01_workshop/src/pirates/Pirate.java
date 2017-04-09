package pirates;

public class Pirate {
  int rumsConsumed;
  boolean alive;
  String name;

  public Pirate() {
    rumsConsumed = 0;
    alive = true;
  }

  public Pirate(String name) {
    rumsConsumed = 0;
    alive = true;
    this.name = name;
  }

  public void drinkSomeRum() {
    if (alive) {
      rumsConsumed++;
    } else {
      System.out.println("This one's dead...no use beating a dead horse. Save the rum for later!");
    }
  }

  public void howsItGoingMate() {
    if (alive == false) {
      System.out.println("This one's dead...no use beating a dead horse. Move along matey!");
    } else {
      if (rumsConsumed == 0) {
        System.out.println("Me mouth is dry matey! Pour me a rum before I gut ye!");
      } else if (rumsConsumed == 1) {
        System.out.println("Pour me anudder! I've only had like a single bloody rum so far...or who knows.");
      } else if (rumsConsumed < 4) {
        System.out.println("Pour me anudder! I've only had like " + rumsConsumed + " rums so far...or who knows.");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        System.out.println("(The pirate passes out and sleeps it off.)");
      }
    }
  }

  public void die() {
    alive = false;
  }

  public void brawl(Pirate target) {
    if (this.alive == false || target.alive == false) {
      System.out.println("It takes two living pirates for a brawl! No use beating a dead pirate!");
    } else {
       int brawlResult = (int)(Math.random()*3+1);

      if (brawlResult == 1) {
        this.die();
        System.out.println(this.name + " has died! Do not mourn, he lived and died like a true pirate!");
      }
      if (brawlResult == 2) {
        target.die();
        System.out.println(target.name + " has died! Do not mourn, he lived and died like a true pirate!");
      }
      if (brawlResult == 3) {
        this.rumsConsumed = 4;
        target.rumsConsumed =4;
        System.out.println("Both pirates have passed out...not the most glorious brawl I've ever seen...");
      }
    }
  }
}

package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew;
  String name;

  public Ship() {
    crew = new ArrayList<>();
  }

  public Ship(String name) {
    crew = new ArrayList<>();
    this.name = name;
  }

  public void fillShip() {
    this.crew.add(new Captain());

    int crewNumber = (int)(Math.random()*50+50);

    for (int i=0; i < crewNumber; i++) {
      this.crew.add(new Pirate());
    }
  }

  public void shipInfo() {
    int aliveCrewMembers = 0;

    if (crew.get(0).alive) {
      System.out.println("The captain of this ship has consumed " + crew.get(0).rumsConsumed + " rums so far.");
      aliveCrewMembers ++;
    } else {
      System.out.println("THE CAPTAIN IS DEAD! WERE IN TROUBLE!");
    }
    for (int i=1; i < crew.size(); i++) {
      if (crew.get(i).alive) {
        aliveCrewMembers ++;
      }
    }
    System.out.println(aliveCrewMembers + " of the ships crew members are still alive.");
  }

  public int shipScore() {
    int aliveCrewMembers = 0;

    for (int i=0; i < crew.size(); i++) {
      if (crew.get(i).alive) {
        aliveCrewMembers ++;
      }
    }
    int shipScore = aliveCrewMembers - crew.get(0).rumsConsumed;
    return shipScore;
  }

  public void battle(Ship target) {
    if (this.shipScore() == target.shipScore()) {
      System.out.println("It's a draw!");
    } else if (this.shipScore() > target.shipScore()) {
      System.out.println("Arrrrr! We won!");
      haveParty();
    } else if (this.shipScore() < target.shipScore()) {
      System.out.println("Arrr ye scurvy dogs, we will win next time!");
      loseCrewMembers();
    }
  }

  public void haveParty() {
    int numberOfRums = (int)(Math.random()*this.crew.size());

    for (int i=0; i < numberOfRums; i++) {
      this.crew.get(i).drinkSomeRum();
    }
  }

  public void loseCrewMembers() {
    int numberOfDeaths = (int)(Math.random()*this.crew.size());

    for (int i=1; i < numberOfDeaths; i++) {
      this.crew.get(i).die();
    }
  }
}

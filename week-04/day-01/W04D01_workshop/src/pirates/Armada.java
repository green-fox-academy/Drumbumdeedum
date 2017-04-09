package pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> shipsInArmada;

  public Armada() {
    shipsInArmada = new ArrayList<>();
  }

  public void fillArmada() {
    int shipNumber = (int)(Math.random()*50+50);

    for (int i=0; i < shipNumber; i++) {
      this.shipsInArmada.add(new Ship());
    }

    for (int i=0; i < shipsInArmada.size(); i++) {
      shipsInArmada.get(i).fillShip();
    }
  }

  public void war(Armada target) {
    int firstAliveShipIndexAttacker = 0;
    int firstAliveShipIndexDefender = 0;

    if (this.shipsInArmada.get(firstAliveShipIndexAttacker).crew.size() > 0) {
      firstAliveShipIndexAttacker += 0;
    } else {
      firstAliveShipIndexAttacker ++;
    }

    if (target.shipsInArmada.get(firstAliveShipIndexDefender).crew.size() > 0) {
      firstAliveShipIndexDefender += 0;
    } else {
      firstAliveShipIndexDefender ++;
    }

    for (int i=0; i < this.shipsInArmada.size(); i++) {
      if (this.shipsInArmada.size() == 0) {
        System.out.println("We've lost! Our armada has been wiped out!");
      } else if (target.shipsInArmada.size() == 0) {
        System.out.println("We've won! We wiped them out!");
      } else {
        this.shipsInArmada.get(firstAliveShipIndexAttacker).battle(target.shipsInArmada.get(firstAliveShipIndexDefender));
      }
    }
  }
}

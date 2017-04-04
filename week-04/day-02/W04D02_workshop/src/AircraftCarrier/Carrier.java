package AircraftCarrier;
import java.util.ArrayList;

public class Carrier {
  int aircraftStore;
  int ammoStore;
  int healthPoints;

  private ArrayList<Aircraft> aircraftsOnCarrier;

  public Carrier(int initialHealthPoints, int initialAmmo) {
    aircraftStore = 0;
    ammoStore = initialAmmo;
    healthPoints = initialHealthPoints;
    aircraftsOnCarrier = new ArrayList<>();
  }

  void addAircraft(String aircraftType) {
    if (aircraftType.equals("F16")) {
      aircraftsOnCarrier.add(new F16());
    }
    if (aircraftType.equals("F35")) {
      aircraftsOnCarrier.add(new F35());
    }
  }

  void fill() {
    int ammoRequired = 0;

    for (int i = 0; i < aircraftsOnCarrier.size(); i++) {
      ammoRequired += (aircraftsOnCarrier.get(i).maxAmmo - aircraftsOnCarrier.get(i).currentAmmo);
    }

    if (ammoStore <= 0) {
      System.out.println("Not enough ammo on carrier!");
    }

    if (ammoRequired < ammoStore) {
      for (int i = 0; i < aircraftsOnCarrier.size(); i++) {
        if (aircraftsOnCarrier.get(i).needsRefill()) {
          aircraftsOnCarrier.get(i).refill(ammoStore);
          ammoStore -= aircraftsOnCarrier.get(i).maxAmmo;
        }
      }
    } else {
      for (int i = 0; i < aircraftsOnCarrier.size(); i++) {
        if (aircraftsOnCarrier.get(i).getType().equals("F35") && aircraftsOnCarrier.get(i).needsRefill())
          aircraftsOnCarrier.get(i).refill(ammoStore);
          ammoStore -= aircraftsOnCarrier.get(i).maxAmmo;
      }
      for (int i = 0; i < aircraftsOnCarrier.size(); i++) {
        if (aircraftsOnCarrier.get(i).getType().equals("F16") && aircraftsOnCarrier.get(i).needsRefill())
          aircraftsOnCarrier.get(i).refill(ammoStore);
          ammoStore -= aircraftsOnCarrier.get(i).maxAmmo;
      }
    }
    System.out.println("After the refill all planes have full ammo. READY TO FIGHT!");
    System.out.println("Carrier has " + ammoStore + " ammo left after refilling all planes.");
  }

  void fight (Carrier name) {
    int totalDMG = 0;

    for (int i=0; i < this.aircraftsOnCarrier.size(); i++) {
      totalDMG += aircraftsOnCarrier.get(i).fight();
    }

    name.healthPoints -= totalDMG;
    System.out.println("A fierce attack has been unleashed upon the enemy carrier!");
    System.out.println("Total damage done during the attack was: " + totalDMG);

    if (name.healthPoints > 0) {
      System.out.println("Enemy carrier has " + name.healthPoints + " health left.");
    } else {
      System.out.println("It's dead jim! :(");
    }


  }

  void getStatus () {
    int totalDMG = 0;

    for (int i=0; i < this.aircraftsOnCarrier.size(); i++) {
      totalDMG += aircraftsOnCarrier.get(i).baseDmg * aircraftsOnCarrier.get(i).currentAmmo;
    }
    System.out.println("Detailed status of carrier and aircrafts:");
    System.out.println("Aircraft count: " + this.aircraftsOnCarrier.size() + ", Ammo Storage: " + this.ammoStore + ", Total damage: " + totalDMG);
    System.out.println("Aircrafts:");
    for (int i=0; i < this.aircraftsOnCarrier.size(); i++) {
      System.out.println("Type: " + aircraftsOnCarrier.get(i).type + ", Ammo: " + aircraftsOnCarrier.get(i).currentAmmo + " Base Damage: " + aircraftsOnCarrier.get(i).baseDmg + " Total Damage: " + aircraftsOnCarrier.get(i).baseDmg * aircraftsOnCarrier.get(i).currentAmmo);
    }
  }
}

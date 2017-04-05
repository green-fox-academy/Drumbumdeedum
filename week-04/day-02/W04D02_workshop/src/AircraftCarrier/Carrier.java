package AircraftCarrier;
import java.util.ArrayList;

public class Carrier {
  int aircraftStore;
  int ammoStore;
  int healthPoints;
  String name;

  private ArrayList<Aircraft> aircraftsOnCarrier;

  public Carrier(int initialHealthPoints, int initialAmmo, String name) {
    aircraftStore = 0;
    ammoStore = initialAmmo;
    healthPoints = initialHealthPoints;
    this.name = name;
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

    if (ammoRequired < ammoStore) {
      for (int i = 0; i < aircraftsOnCarrier.size(); i++) {
        if (aircraftsOnCarrier.get(i).needsRefill()) {
          aircraftsOnCarrier.get(i).refill(ammoStore);
          ammoStore -= aircraftsOnCarrier.get(i).maxAmmo;
        }
      }
    } else if (ammoRequired > ammoStore) {
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
    } else if (ammoStore <= 0) {
      ammoStore = 0;
      System.out.println("Not enough ammo on carrier!");
    }
    System.out.println("After the refill all planes on " + this.name + " have full ammo. READY TO FIGHT!");
    System.out.println(this.name + " has " + ammoStore + " ammo left in the ammo storage after refilling all planes.");
  }

  void fight (Carrier name) {
    int totalDMG = 0;

    for (int i=0; i < this.aircraftsOnCarrier.size(); i++) {
      totalDMG += aircraftsOnCarrier.get(i).fight();
    }

    System.out.println(this.name + " unleashed a fierce attack on the enemy carrier called: " + name.name + ".");
    System.out.println("Total damage done to " + name.name + ": " + totalDMG);
    System.out.println(name.name + " had " + name.healthPoints + " health before the attack.");
    name.healthPoints -= totalDMG;

    if (name.healthPoints > 0) {
      System.out.println(name.name + " has " + name.healthPoints + " health left after the attack.");
    } else {
      System.out.println("It's dead jim! :(");
    }


  }

  void getStatus () {
    int totalDMG = 0;

    for (int i=0; i < this.aircraftsOnCarrier.size(); i++) {
      totalDMG += aircraftsOnCarrier.get(i).baseDmg * aircraftsOnCarrier.get(i).currentAmmo;
    }
    System.out.println("Carrier name: " + this.name);
    System.out.println("Detailed status of carrier and aircrafts:");
    System.out.println("Aircraft count: " + this.aircraftsOnCarrier.size() + ", Ammo Storage: " + this.ammoStore + ", Total damage: " + totalDMG);
    System.out.println("Aircrafts:");
    for (int i=0; i < this.aircraftsOnCarrier.size(); i++) {
      System.out.println("Type: " + aircraftsOnCarrier.get(i).type + ", Ammo: " + aircraftsOnCarrier.get(i).currentAmmo + " Base Damage: " + aircraftsOnCarrier.get(i).baseDmg + " Total Damage: " + aircraftsOnCarrier.get(i).baseDmg * aircraftsOnCarrier.get(i).currentAmmo);
    }
  }
}

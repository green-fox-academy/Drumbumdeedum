package Garden;

import java.util.ArrayList;

public class Garden {
  private ArrayList<Plants> gardenPlants;

  public Garden() {
    gardenPlants = new ArrayList<Plants>();
  }

  void addPlant(Plants name) {
    gardenPlants.add(name);
  }

  void gardenState() {
    for (int i=0; i < gardenPlants.size(); i++) {
      gardenPlants.get(i).plantInfo();
    }
  }

  void waterPlants(double waterAmount) {
    System.out.println("Watering plants with " + (int)waterAmount);

    int needWater = 0;

    for (int i=0; i < gardenPlants.size(); i++) {
      if (gardenPlants.get(i).checkWater()) {
        needWater ++;
      }
    }

    waterAmount = waterAmount / needWater;

    for (int i=0; i < gardenPlants.size(); i++) {
      if (gardenPlants.get(i).checkWater()) {
        gardenPlants.get(i).getWater(waterAmount);
      }
    }
  }
}

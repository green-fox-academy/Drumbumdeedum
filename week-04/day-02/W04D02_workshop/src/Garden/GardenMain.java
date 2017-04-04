package Garden;

public class GardenMain {

  public static void main(String[] args) {

    Garden gardenPlants = new Garden();

    gardenPlants.addPlant(new Flower("blue"));
    gardenPlants.addPlant(new Flower("yellow"));
    gardenPlants.addPlant(new Tree("purple"));
    gardenPlants.addPlant(new Tree("orange"));

    gardenPlants.gardenState();
    System.out.println();

    gardenPlants.waterPlants(40);
    System.out.println();

    gardenPlants.gardenState();
    System.out.println();

    gardenPlants.waterPlants(70);
    System.out.println();

    gardenPlants.gardenState();
  }
}

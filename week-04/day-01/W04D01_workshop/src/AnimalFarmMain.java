public class AnimalFarmMain {

  public static void main(String[] args) {

    AnimalFarm farm = new AnimalFarm();
    farm.breed("Zebra");
    farm.breed("Lion");
    farm.breed("Elephant");
    farm.breed("Antelope");

    for (int i=0; i < 4; i++) {
      farm.animals.get(0).eat();
    }

    for (int i=0; i < 5; i++) {
      farm.animals.get(1).eat();
    }

    for (int i=0; i < 2; i++) {
      farm.animals.get(2).play();
    }

    for (int i=0; i < 3; i++) {
      farm.animals.get(3).play();
    }

    System.out.println("Number of animals on farm before slaughter: " + farm.animals.size());
    for (int i=0; i < farm.animals.size(); i++) {
      System.out.println(farm.animals.get(i).name + "\n - has a hunger level of: " + farm.animals.get(i).hunger + "\n - has a thirst level of: " + farm.animals.get(i).thirst);
    }

    System.out.println();
    farm.slaughter();
    System.out.println();

    System.out.println("Number of animals on farm after slaughter: " + farm.animals.size());
    for (int i=0; i < farm.animals.size(); i++) {
      System.out.println(farm.animals.get(i).name + "\n - has a hunger level of: " + farm.animals.get(i).hunger + "\n - has a thirst level of: " + farm.animals.get(i).thirst);
    }

    System.out.println();
    farm.slaughter();
    System.out.println("Number of animals on farm after slaughter: " + farm.animals.size());
    farm.slaughter();
    System.out.println("Number of animals on farm after slaughter: " + farm.animals.size());
    farm.slaughter();
    System.out.println("Number of animals on farm after slaughter: " + farm.animals.size());
  }
}


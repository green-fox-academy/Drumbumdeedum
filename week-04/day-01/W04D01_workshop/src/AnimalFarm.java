import java.util.ArrayList;
import java.util.List;

public class AnimalFarm {
  public static List<Animal> animals;
  public static int farmCapacity;


  public AnimalFarm () {
    this.animals = new ArrayList <>();
    this.farmCapacity = 4;
  }

  public void breed (String name) {
    if (0 < farmCapacity) {
      animals.add(new Animal(name));
      farmCapacity -= 1;
    }
  }

  public void slaughter () {
    int leastHungryLevel = 100;
    int indexOfLeastHungry = 0;

    for (int i=0; i < animals.size(); i++) {
      if (animals.get(i).hunger < leastHungryLevel) {
        leastHungryLevel = animals.get(i).hunger;
        indexOfLeastHungry = i;
      }
    }
    System.out.println(animals.get(indexOfLeastHungry).name + " has been slaughtered!");
    animals.remove(indexOfLeastHungry);
  }
}

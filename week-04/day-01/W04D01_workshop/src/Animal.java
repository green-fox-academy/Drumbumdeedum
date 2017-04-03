public class Animal {
  int hunger;
  int thirst;

  public Animal(int hunger, int thirst) {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void createAnimal() {
  }

  public void eat () {
    this.hunger -= 1;
  }

  public void drink () {
    this.thirst -=1;
  }

  public void play () {
    this.thirst += 1;
    this.hunger += 1;
  }
}

class createAnimal {

  public static void main(String[] args) {

    Animal zebra = new Animal(0,0);
    Animal tiger = new Animal(0,0);
    Animal lion = new Animal(0,0);

    zebra.eat();
    zebra.eat();
    tiger.drink();
    lion.play();
    lion.play();

    System.out.println("Zebra:\n" + "\t - hunger level: " + zebra.hunger + "\n\t - thirst level: " + zebra.thirst);
    System.out.println("Tiger:\n" + "\t - hunger level: " + tiger.hunger + "\n\t - thirst level: " + tiger.thirst);
    System.out.println("Lion:\n" + "\t - hunger level: " + lion.hunger + "\n\t - thirst level: " + lion.thirst);
  }
}

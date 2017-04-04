class CreateAnimal {

  public static void main(String[] args) {

    Animal zebra = new Animal("zebra");
    Animal tiger = new Animal("tiger");
    Animal lion = new Animal("lion");

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

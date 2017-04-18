public class Reptile extends Animal implements Egg {

  public Reptile(String name) {
    childSource = "wants a child from an egg!";
    this.name = name;
  }
}

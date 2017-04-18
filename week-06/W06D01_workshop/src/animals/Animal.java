package animals;

public abstract class Animal {

  String name, childSource;
  int age;

  public Animal() {

  }

  public Animal(String name, int age, String childSource) {
    this.name = name;
    this.age = age;
    this.childSource = childSource;
  }

  public void greet() {

  }

  public String wantChild() {
    return this.childSource;
  }

  public String getName() {
    return this.name;
  }

}

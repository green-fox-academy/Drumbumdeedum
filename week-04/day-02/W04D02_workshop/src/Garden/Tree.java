package Garden;

public class Tree extends Plants {

  public Tree (String color) {
    super.type = "tree";
    super.color = color;
    super.waterLevel = 0;
    super.waterRequirement = 10;
  }
}

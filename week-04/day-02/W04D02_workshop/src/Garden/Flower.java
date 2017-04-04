package Garden;

public class Flower extends Plants {

  public Flower (String color) {
    super.type = "flower";
    super.color = color;
    super.waterLevel = 0;
    super.waterRequirement = 5;
  }
}

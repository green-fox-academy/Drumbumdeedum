package parkinglot;

public class Car {

  public enum TYPE {AUDI, BMW, VOLKSWAGEN, SUZUKI, TOYOTA, VOLVO}
  public enum COLOR {RED, BLUE, GREEN, GREY, BLACK, WHITE, YELLOW}

  TYPE type;
  COLOR color;

  public Car() {
    int typeIndex = (int)(Math.random() * TYPE.values().length);
    int colorIndex = (int)(Math.random() * COLOR.values().length);
    type = TYPE.values()[typeIndex];
    color = COLOR.values()[colorIndex];
  }

  public String toString() {
    return color.toString() + " " + type.toString();
  }
}

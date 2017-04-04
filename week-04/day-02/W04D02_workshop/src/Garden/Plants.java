package Garden;

public class Plants extends Garden {
  int waterRequirement;
  String type;
  double waterLevel;
  String color;

  boolean checkWater() {
    return waterLevel < waterRequirement;
  }

  void getWater(double waterAmount) {
    if (this.type == "flower") {
      waterLevel += waterAmount * .75f;
    }
    if (this.type == "tree") {
      waterLevel += waterAmount * .4f;
    }
  }

  void plantInfo() {
    if (this.checkWater()) {
      System.out.println("The " + color + " " + type + " needs water.");
    } else {
      System.out.println("The " + color + " " + type + " doesn't need water.");
    }
  }
}




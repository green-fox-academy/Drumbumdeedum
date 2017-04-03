public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie (String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    this.inkAmount -= 1;
  }
}

class createSharpie {

  public static void main(String[] args) {

    Sharpie sharpie1 = new Sharpie("red", 1);

    System.out.println(sharpie1.color);
    System.out.println(sharpie1.width);
    System.out.println(sharpie1.inkAmount);
    System.out.println();

    sharpie1.use();

    System.out.println(sharpie1.color);
    System.out.println(sharpie1.width);
    System.out.println(sharpie1.inkAmount);
  }
}

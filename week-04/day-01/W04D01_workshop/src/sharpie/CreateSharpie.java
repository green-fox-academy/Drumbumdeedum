package sharpie;

class CreateSharpie {

  public static void main(String[] args) {

    Sharpie sharpie1 = new Sharpie("red", 1);

    System.out.println("Color: " + sharpie1.color);
    System.out.println("Width: " + sharpie1.width);
    System.out.println("Ink amount: " + sharpie1.inkAmount);
    System.out.println();

    sharpie1.use();
    System.out.println("After use:");

    System.out.println("Color: " + sharpie1.color);
    System.out.println("Width: " + sharpie1.width);
    System.out.println("Ink amount: " + sharpie1.inkAmount);
  }
}

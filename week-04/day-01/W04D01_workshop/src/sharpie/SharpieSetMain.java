package sharpie;

public class SharpieSetMain {
  public static void main(String[] args) {
    Sharpie blue = new Sharpie("blue", 1);
    Sharpie green = new Sharpie("green", 2);
    Sharpie red = new Sharpie("red", 0.5f);
    Sharpie yellow = new Sharpie("yellow", 1.5f);
    SharpieSet mySharpies = new SharpieSet();

    mySharpies.addSharpie(blue);
    mySharpies.addSharpie(green);
    mySharpies.addSharpie(red);
    mySharpies.addSharpie(yellow);

    for (int i = 0; i < 100; i++) {
      blue.use();
      red.use();
    }

    System.out.println("Red sharpie ink amount left: " + blue.inkAmount);
    System.out.println("Blue sharpie ink amount left: " + red.inkAmount);
    System.out.println("Usable sharpies left: ");
    SharpieSet.countUsable();
  }
}

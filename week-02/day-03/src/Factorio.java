/**
 * Created by danielszalay on 2017. 03. 22..
 */
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial


public class Factorio {
  public static void main(String[] args) {

    int value1 = 5;

    System.out.println(factorio(value1));
  }

  public static int factorio(int value) {
    int factorioValue = 1;
    for (int a =  value; a > 0;  a--) {
      factorioValue *= a;
    }
    return factorioValue;
  }
}


/**
 * Created by danielszalay on 2017. 03. 22..
 */
// - Create an integer variable named `ak` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter
// - Print the result of `doubling(ak)`

public class Doubling {
  static int ak = 123;

  public static void main(String[] args) {
    System.out.println(doubling(ak));
  }

  public static int doubling(int value) {
    return (value * 2);
  }
}
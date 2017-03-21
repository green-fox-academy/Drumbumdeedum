/**
 * Created by danielszalay on 2017. 03. 21..
 */
// Create a program that prints all the even numbers between 0 and 500

public class PrintEven {
  public static void main(String[] args) {
    int a = 1;
    while ((a <= 500)) {
      if (a % 2 == 0) {
        System.out.println(a);
      }
      a += 1;
    }
  }
}

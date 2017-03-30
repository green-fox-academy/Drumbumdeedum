/**
 * Created by danielszalay on 2017. 03. 30..
 */
public class Numberadder {
  public static void main(String[] args) {

    System.out.println(addNumbers(3));

  }

  public static int addNumbers(int topNumber) {
    if (topNumber == 1) {
      return 1;
    } else {
      int sum = topNumber + addNumbers(topNumber-1);
      return sum;
    }
  }
}

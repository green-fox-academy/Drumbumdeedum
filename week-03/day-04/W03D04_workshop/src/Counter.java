public class Counter {

  public static void main(String[] args) {
    System.out.println(countDown(6));
  }

  public static String countDown(int topNumber) {
    if (topNumber == 1) {
      return "" + 1;
    } else {
      return "" + topNumber + "\n" + countDown(topNumber - 1);
    }
  }
}

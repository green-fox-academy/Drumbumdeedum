public class Counter {

  public static void main(String[] args) {
    countDown(6);
  }

  public static int countDown(int topNumber) {
      if (topNumber == 0) {
        System.out.println(0);
      }
      else {
        System.out.println(topNumber);
        countDown(topNumber-1);
      }
    return(topNumber);
  }
}

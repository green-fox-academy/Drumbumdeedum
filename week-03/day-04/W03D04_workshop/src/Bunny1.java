public class Bunny1 {
  public static void main(String[] args) {

    System.out.println(countBunnyEars(12));

  }

  public static int countBunnyEars (int bunnies) {
    if (bunnies == 1) {
      return bunnies * 2;
    }
    else {
      int ears = 2;
      ears = ears + countBunnyEars(bunnies-1);
      return ears;
    }
  }
}

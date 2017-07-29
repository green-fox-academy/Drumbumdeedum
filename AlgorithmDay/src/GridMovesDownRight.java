
public class GridMovesDownRight {

  public static void main(String[] args) {
    long gridSize = 20;
    System.out.println(totalPossibleMoves(gridSize));
  }

  public static long totalPossibleMoves(long gridSize) {
    long divisor = factorial(2 * gridSize);
    System.out.println(divisor);
    long dividedBy = factorial(gridSize) * factorial(gridSize);
    System.out.println(dividedBy);
    return divisor / dividedBy;
  }

  public static long factorial(long input) {
    long result = 1;
    for (int i = 1; i <= input; i++) {
      result *= i;
    }
    return result;
  }
}

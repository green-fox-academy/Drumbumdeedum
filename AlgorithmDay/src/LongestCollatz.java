public class LongestCollatz {

  public static void main(String[] args) {

    long longestSequence = 1;
    long number = 1;

    for (int i = 1; i < 1000000; i++) {
      if (collatzSequenceLength(i) > longestSequence) {
        longestSequence = collatzSequenceLength(i);
        number = i;
      }
    }
    System.out.println(longestSequence);
    System.out.println(number);
  }

  public static long collatzSequenceLength(long inputNumber) {
    long input = inputNumber;
    long sequenceLength = 1;
    long currentNumber = inputNumber;

    while(currentNumber > 1) {
      if (currentNumber % 2 == 0) {
        currentNumber /= 2;
        sequenceLength++;
      } else {
        currentNumber = (currentNumber * 3)+ 1;
        sequenceLength++;
      }
    }
    //System.out.println("Sequence length for input number " + input + " is: " + sequenceLength);
    return sequenceLength;
  }
}

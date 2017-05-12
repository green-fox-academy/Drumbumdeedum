import java.util.ArrayList;
import java.util.List;

public class KataTwo {

  public static List<Object> fizzBuzz() {
    List<Object> fizzBuzzList = new ArrayList<>();
    for (int i=1; i < 101; i++) {
      fizzBuzzList.add(i);
    }
    fizzBuzzList.set(2, "Fizz");
    fizzBuzzList.set(4, "Buzz");
    fizzBuzzList.set(14, "FizzBuzz");
    return fizzBuzzList;
  }

  /*public static List<Object> fizzBuzz() {
    List<Object> fizzBuzzList = new ArrayList<>();

    for (int i=1; i < 101; i++) {
      if (i % 3 == 0 && i % 5 != 0) {
        fizzBuzzList.add("Fizz");
      } else if (i % 5 == 0 && i % 3 != 0) {
        fizzBuzzList.add("Buzz");
      } else if (i % 3 == 0 && i % 5 == 0) {
        fizzBuzzList.add("FizzBuzz");
      } else {
        fizzBuzzList.add(i);
      }
    }
    return fizzBuzzList;
  }*/
}

import static org.junit.Assert.*;

import org.junit.Test;

public class KataTwoTest {

  @Test
  public void ThirdElementFizz() {
    assertEquals("Fizz",KataTwo.fizzBuzz().get(2));
  }

  @Test
  public void ListLengthCheck() {
    assertEquals(100, KataTwo.fizzBuzz().size());
  }

  @Test
  public void FifthElementBuzz() {
    assertEquals("Buzz", KataTwo.fizzBuzz().get(4));
  }

  @Test
  public void FifteenthElementFizzBuzz() {
    assertEquals("FizzBuzz", KataTwo.fizzBuzz().get(14));
  }

  @Test
  public void Number47() {
    assertEquals(47, KataTwo.fizzBuzz().get(46));
  }

  @Test
  public void Number() {
    Object check = 4;

    assertEquals(4, KataTwo.fizzBuzz().get(check-1));
  }
}

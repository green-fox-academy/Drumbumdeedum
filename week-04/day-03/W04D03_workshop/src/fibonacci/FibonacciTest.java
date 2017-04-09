package fibonacci;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FibonacciTest {

  Fibonacci fibonacci = new Fibonacci();
  int element;
  int elementValue;

  @Test
  public void returns1stElt() {
    element = 1;
    elementValue = 1;
    assertEquals(elementValue, fibonacci.fibonacciN(element));
}

  @Test
  public void returns2ndElt() {
    element = 2;
    elementValue = 1;
    assertEquals(elementValue, fibonacci.fibonacciN(element));
  }

  @Test
  public void returns3rdElt() {
    element = 3;
    elementValue = 2;
    assertEquals(elementValue, fibonacci.fibonacciN(element));
  }

  @Test
  public void returns11thElt() {
    element = 11;
    elementValue = 89;
    assertEquals(elementValue, fibonacci.fibonacciN(element));
  }

  @Test
  public void returns21stElt() {
    element = 21;
    elementValue = 10946;
    assertEquals(elementValue, fibonacci.fibonacciN(element));
  }

  @Test
  public void avoidsMinusIndex() {
    element = -1;
    elementValue = 0;
    assertEquals(elementValue, fibonacci.fibonacciN(element));
  }
}

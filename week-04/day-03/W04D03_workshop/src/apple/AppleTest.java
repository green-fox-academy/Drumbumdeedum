package apple;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppleTest {
  Apple testApple = new Apple();

  @Test
  public void getApple() {
    assertEquals("apple", testApple.getApple());
  }
}

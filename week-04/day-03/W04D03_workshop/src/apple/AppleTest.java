package apple;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppleTest {
  @Test
  public void getApple() throws Exception {
    Apple apple1 = new Apple();

    assertEquals("apple", apple1.getApple());
  }
}
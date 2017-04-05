package sum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SumTest {
  @Test
  public void sumElements() throws Exception {
    Sum list1 = new Sum();

    assertEquals(0, list1.sumNumbers());
  }
}
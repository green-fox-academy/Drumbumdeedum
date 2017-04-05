package sum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SumTest {
  @Test
  public void sumElements() throws Exception {
    ArrayList<Integer> input = new ArrayList<>();
    input.add(1);
    input.add(2);
    input.add(3);

    Sum list1 = new Sum(input);

    assertEquals(6, list1.sumNumbers());
  }
}
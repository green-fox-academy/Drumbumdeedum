package sum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SumTest {
  @Test
  public void sumMultiple() throws Exception {
    ArrayList<Integer> input = new ArrayList<>();
    input.add(1);
    input.add(2);
    input.add(3);
    Sum list1 = new Sum(input);
    assertEquals(6, list1.sumNumbers());
  }

  @Test
  public void sumOne() throws Exception {
    ArrayList<Integer> input = new ArrayList<>();
    input.add(7);
    Sum list1 = new Sum(input);
    assertEquals(7, list1.sumNumbers());
  }

  @Test
  public void sumNone() throws Exception {
    ArrayList<Integer> input = new ArrayList<>();
    Sum list1 = new Sum(input);
    assertEquals(0, list1.sumNumbers());
  }
}

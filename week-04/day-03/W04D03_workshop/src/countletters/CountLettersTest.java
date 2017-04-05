package countletters;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountLettersTest {
  private CountLetters countThis;

  @Test
  void count1() {
    countThis = new CountLetters("a");
    assertEquals(0, countThis.countInWord('b'));
  }

  @Test
  void count2() {
    countThis = new CountLetters("aabb");
    assertEquals(2, countThis.countInWord('a'));
  }

  @Test
  void countMultiple() {
    countThis = new CountLetters("ThisisaLongerSentence");
    assertEquals(4, countThis.countInWord('e'));
  }
}
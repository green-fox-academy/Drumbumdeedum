package anagram;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnagramTest {
  public Anagram checkThis;

  @Test
  void isAnagram() {
    checkThis = new Anagram("dog", "god");
    assertTrue(checkThis.checkAnagram());
  }

  @Test
  void isNotAnagram() {
    checkThis = new Anagram("dog", "bob");
    assertFalse(checkThis.checkAnagram());
  }
}

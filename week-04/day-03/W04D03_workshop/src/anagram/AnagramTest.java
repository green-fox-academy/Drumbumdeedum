package anagram;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnagramTest {

  @Test
  void isAnagram() {
    Anagram one = new Anagram("dog", "god");

    assertEquals(true, one.checkAnagram());
  }

  @Test
  void isNotAnagram() {
    Anagram one = new Anagram("dog", "bob");

    assertEquals(false, one.checkAnagram());
  }
}
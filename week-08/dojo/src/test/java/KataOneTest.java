import static org.junit.Assert.*;

import org.junit.Test;

public class KataOneTest {

  @Test
  public void NullWords() {
    assertEquals(false, KataOne.anagramChecker(null, null));
  }

  @Test
  public void WordWithWhiteSpace() {
    assertEquals(true, KataOne.anagramChecker("dog", "  d  o  g  "));
  }

  @Test
  public void DifferentCases() {
    assertEquals(true, KataOne.anagramChecker("dog", "DOG"));
  }

  @Test
  public void DifferentLength() {
    assertEquals(false, KataOne.anagramChecker("doggie", "dog"));
  }

  @Test
  public void ActualAnagrams() {
    assertEquals(true, KataOne.anagramChecker("dog", "god"));
  }

  @Test
  public void HitlerWoman() {
    assertEquals(true, KataOne.anagramChecker("Mother In Law", "Hitler Woman"));
  }
}

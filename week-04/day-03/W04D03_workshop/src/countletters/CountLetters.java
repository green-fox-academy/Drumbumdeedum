package countletters;

import java.util.HashMap;

public class CountLetters {
  HashMap<Character, Integer> dictionary;
  String inputWord;

  public CountLetters(String inputWord) {
    this.inputWord = inputWord;
    dictionary = new HashMap<>();
    this.fillDictionary();
  }

  public void fillDictionary() {
    for (int i = 0; i < this.inputWord.length(); i++) {
      if (dictionary.containsKey(this.inputWord.charAt(i))) {
        dictionary.replace(this.inputWord.charAt(i), dictionary.get(this.inputWord.charAt(i)) + 1);
      } else {
        dictionary.put(this.inputWord.charAt(i), 1);
      }
    }
  }

  public int countInWord(char inputCharacter) {
    if (dictionary.containsKey(inputCharacter)) {
      return dictionary.get(inputCharacter);
    } else {
      return 0;
    }
  }
}


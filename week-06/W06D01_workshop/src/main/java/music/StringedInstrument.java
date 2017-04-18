package main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;
  final String formatForPlay = "%s, is a %d-stringed instrument that makes a sound like this: %s.\n";

  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}

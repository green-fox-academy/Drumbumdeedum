package dice;

public class Dice {
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.getCurrent();
    myDice.roll();

    int sumTotalRoll = 0;

    for (int i=0; i < 36; i++) {
      sumTotalRoll = 0;
      for (int j=0; j < myDice.getCurrent().length; j++) {
        if (myDice.getCurrent(j) != 6) {
          myDice.reroll(j);
        }
        else {
          sumTotalRoll += myDice.getCurrent(j);
        }
      }
    }

    for (int i=0; i < 6; i++) {
      System.out.println("Dice nr." + (i+1) + " is a: " + myDice.getCurrent(i));
    }
  }
}

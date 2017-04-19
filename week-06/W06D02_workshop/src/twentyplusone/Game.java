package twentyplusone;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
  private static Deck playingDeck;
  private static ArrayList<Card> playerHand;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    playingDeck = new Deck();
    playingDeck.shuffleDeck();
    playerHand = new ArrayList<>();
    drawCards(2);
    int houseValue = (int)(Math.random() * 7 + 15);

    while (getHandValue() < 21) {
      printPlayerHand();
      System.out.println("1: Continue, 2: Stop, 3: Show top card, 4: Shuffle Deck");
      int choice = scanner.nextInt();
      if (choice == 1) {
        drawCards(1);
      } else if (choice == 2) {
        if (getHandValue() <= houseValue) {
          System.out.println("House wins with " + houseValue + " points.");
        } else {
          System.out.println("You win with " + getHandValue() + " points, house had " + houseValue + " points.");
        }
      } else if (choice == 3) {
        System.out.println("Top cards is a " + playingDeck.peek());
      } else if (choice == 4) {
        playingDeck.shuffleDeck();
        System.out.println("Deck is shuffled");
      }
    }
    if (getHandValue() == 21 && getHandValue() > houseValue) {
      System.out.println("You won with 21!");
    } else if (getHandValue() == 21 && getHandValue() < houseValue) {
        System.out.println("House wins with " + houseValue);
    } else if (getHandValue() > 21) {
      System.out.println("You lost with " + getHandValue());
    }
  }

  private static void printPlayerHand() {
    System.out.println("Your hand value is " + getHandValue());
  }

  private static void drawCards(int num) {
    for (int i = 0; i < num; i++) {
      playerHand.add(playingDeck.pullFirst());
    }
  }

  private static int getHandValue() {
    int count = 0;
    for (Card card : playerHand) {
      count += card.getValue();
    }
    if (count > 21) {
      // Check for Aces
      for (Card card : playerHand) {
        if (card.getValue() == 11) {
          count -= 10;
        }
        if (count <= 21) {
          break;
        }
      }
    }
    return count;
  }
}

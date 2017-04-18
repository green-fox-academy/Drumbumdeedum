package domino;
import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();

    System.out.println("  Original order: " + dominoes);

    Domino tempDomino;

    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = 1; j < dominoes.size(); j++) {
        if (dominoes.get(i).getValues()[1] == dominoes.get(j).getValues()[0]) {
          tempDomino = dominoes.get(i + 1);
          dominoes.set(i + 1, dominoes.get(j));
          dominoes.set(j, tempDomino);
        }
      }
    }
    System.out.println("Rearranged order: " + dominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}

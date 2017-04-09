package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  public static List<Sharpie> sharpies;
  public static int sharpieCount;

  public SharpieSet() {
    sharpies = new ArrayList<>();
    sharpieCount = 0;
  }

  public void addSharpie(Sharpie sharpieToAdd) {
    sharpies.add(sharpieToAdd);
    sharpieCount = sharpies.size();
  }

  public static void removeTrash() {
    for (int i=0; i < sharpies.size(); i++) {
      if (sharpies.get(i).inkAmount <= 0) {
        sharpies.remove(i);
        sharpieCount -= 1;
      }
    }
  }

  public static void countUsable() {
    SharpieSet.removeTrash();
    System.out.println(sharpieCount);
  }
}

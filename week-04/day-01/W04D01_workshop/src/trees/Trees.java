package trees;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Trees {

  public static void main(String[] args) {

    ArrayList<Map<String, String>> trees = new ArrayList<Map<String, String>>();

    Map<String, String> tree0 = new HashMap<String, String>();
    tree0.put("type", "chestnut");
    tree0.put("leaf color", "green");
    tree0.put("age", "5 years");
    tree0.put("sex", "female/seed");
    trees.add(tree0);


    Map<String, String> tree1 = new HashMap<String, String>();
    tree1.put("type", "redwood");
    tree1.put("leaf color", "green");
    tree1.put("age", "127 years");
    tree1.put("sex", "male/pollen");
    trees.add(tree1);

    Map<String, String> tree2 = new HashMap<String, String>();
    tree2.put("type", "red oak");
    tree2.put("leaf color", "red");
    tree2.put("age", "11 years");
    tree2.put("sex", "female/seed");
    trees.add(tree2);

    Map<String, String> tree3 = new HashMap<String, String>();
    tree3.put("type", "cassia fistula");
    tree3.put("leaf color", "yellow");
    tree3.put("age", "3 years");
    tree3.put("sex", "male/pollen");
    trees.add(tree3);

    Map<String, String> tree4 = new HashMap<String, String>();
    tree4.put("type", "birch");
    tree4.put("leaf color", "green");
    tree4.put("age", "7 years");
    tree4.put("sex", "female/seed");
    trees.add(tree4);

    for (int i=0; i < trees.size(); i++) {
      System.out.println("tree"+(i+1));
      System.out.println("\t" + "- type: " + trees.get(i).get("type"));
      System.out.println("\t" + "- sex: " + trees.get(i).get("sex"));
      System.out.println("\t" + "- age: " + trees.get(i).get("age"));
      System.out.println("\t" + "- leaf color: " + trees.get(i).get("leaf color"));
      System.out.println();
    }
  }
}

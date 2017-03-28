/**
 * Created by danielszalay on 2017. 03. 27..
 */
import java.util.HashMap;

public class hashTry {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("key_1","one");
    map.put("key_2","two");
    map.put("key_3","three");
    map.put("key_4","four");

    System.out.println(getKeyFromValue(map,"four"));
  }


  public static Object getKeyFromValue(HashMap inputHashmap, Object value) {
    for (Object o : inputHashmap.keySet()) {
      if (inputHashmap.get(o).equals(value)) {
        return o;
      }
    }
    return null;
  }
}
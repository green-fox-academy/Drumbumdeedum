/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Add "a" to every string in the far list.
import java.util.*;


public class AppendLetter{
  public static void main(String... args){
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

    for (int i = 0; i < far.size(); i++) {
      far.add(i, far.get(i) + "a");
      far.remove(i+1);
    }

    System.out.println(far);
  }
}
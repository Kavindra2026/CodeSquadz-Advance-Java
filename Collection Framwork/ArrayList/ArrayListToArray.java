
import java.util.ArrayList;

public class ArrayListToArray {

  public static void main(String[] args) {
    ArrayList<String> arrlist = new ArrayList<String>();
    arrlist.add("String1");
    arrlist.add("String2");
    arrlist.add("String3");
    arrlist.add("String4");
    String array[] = new String[arrlist.size()];
    for (int j = 0; j < arrlist.size(); j++) {
      array[j] = arrlist.get(j);
    }
    for (String k : array) {
      System.out.println(k);
    }
  }
}

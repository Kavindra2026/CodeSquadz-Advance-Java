import java.util.*;

public class ArrayToArrayList {
  public static void main(String[] args) {

    String cityname[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };
    List<String> l = Arrays.asList(cityname);
    System.out.println(l.getClass().getName());
    ArrayList<String> citylist = new ArrayList<String>(l);

    citylist.add("New city2");
    citylist.add("New city3");
    for (String str : citylist) {
      System.out.println(str);
    }

  }

}

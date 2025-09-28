import java.util.ArrayList;

public class CompareArrayList {

  public static void main(String[] args) {

    ArrayList<String> a11 = new ArrayList<String>();
    a11.add("hi");
    a11.add("How are you");
    a11.add("Good Morning");
    a11.add("Bye");
    a11.add("Good night");
    ArrayList<String> a12 = new ArrayList<String>();
    a12.add("Howdy");
    a12.add("Good Evening ");
    a12.add("Bye");
    a12.add("Good night");

    ArrayList<String> a13 = new ArrayList<String>();
    for (String temp : a11)
      a13.add(a12.contains(temp) ? "Yes" : "No");
    System.out.println(a13);

    ArrayList<Integer> a14 = new ArrayList<Integer>();
    for (String temp2 : a11)
      a14.add(a12.contains(temp2) ? 1 : 0);
    System.out.println(a14);
  }
}

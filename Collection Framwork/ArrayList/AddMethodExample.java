
import java.util.ArrayList;

public class AddMethodExample {

  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("Hi");
    al.add("helo");
    al.add("string");
    al.add("Test");
    al.add(3, "lalu");
    System.out.println(al);
    al.add(0, "Bye");
    System.out.println("Element after adding string bye" + al);
  }
}

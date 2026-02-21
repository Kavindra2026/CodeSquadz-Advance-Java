
import java.util.Vector;

public class EnsureCapacityExample {
  public static void main(String[] args) {

    Vector<String> al = new Vector<String>(4);
    System.out.println(al.capacity());
    al.add("Hi");
    al.add("Hello");
    al.add("bye");
    al.add("GM");

    al.ensureCapacity(76);
    System.out.println(al.capacity());
    System.out.println(al);
    al.add("GE");
    al.add("GE");
    al.add("GE");
    System.out.println(al.capacity());
    for (String temp : al) {
      System.out.println(temp);
    }

  }

}

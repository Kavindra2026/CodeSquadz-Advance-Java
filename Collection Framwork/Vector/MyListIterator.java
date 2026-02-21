import java.util.Vector;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {
  public static void main(String[] args) {
      List<Integer> li=new Vector<Integer>();
      ListIterator<Integer> litr=null;
      li.add(23);
      li.add(98);
      li.add(29);
      li.add(71);
      li.add(5);
      litr=li.listIterator();
      System.out.println("Elements in forward directition");
      while(litr.hasNext())
      {
        System.out.println(litr.next());
      }
      System.out.println("Elememts in backward direction");
      while (litr.hasPrevious()) {
          System.out.println(litr.previous());
      }
  }
  
}
/*output
Elements in forward directition
23
98
29
71
5
Elememts in backward direction
5
71
29
98
23
 */
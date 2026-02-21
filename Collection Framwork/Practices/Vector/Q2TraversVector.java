import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Q2TraversVector {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

        // 1. Using for-each loop
        System.out.println("Using for-each:");
        for (String s : vector) {
            System.out.println(s);
        }

        // 2. Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = vector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 3. Using Enumeration (legacy)
        System.out.println("Using Enumeration:");
        Enumeration<String> en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());

        }

    }

}

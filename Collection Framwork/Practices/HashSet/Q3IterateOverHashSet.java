import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q3IterateOverHashSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");

        // 1. for-each loop
        System.out.println("Using for-each:");
        for (String s : set) {
            System.out.println(s);
        }

        // 2. Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}

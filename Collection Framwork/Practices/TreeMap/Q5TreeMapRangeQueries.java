import java.util.TreeMap;

public class Q5TreeMapRangeQueries {
    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Add entries
        tm.put(1, "Apple");
        tm.put(2, "Banana");
        tm.put(3, "Mango");
        tm.put(4, "Orange");
        tm.put(5, "Grapes");

        // Original TreeMap
        System.out.println("Original TreeMap:");
        System.out.println(tm);

        // Range Queries
        System.out.println("\nsubMap(1, 3)  // keys 1 to <3");
        System.out.println(tm.subMap(1, 3));

        System.out.println("\nheadMap(3)   // keys <3");
        System.out.println(tm.headMap(3));

        System.out.println("\ntailMap(2)   // keys >=2");
        System.out.println(tm.tailMap(2));
    }
}

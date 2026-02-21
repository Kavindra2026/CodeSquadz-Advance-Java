import java.util.NavigableMap;
import java.util.TreeMap;

public class Q4RevrseOrder {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(1, "Apple");
        tm.put(2, "Banana");
        tm.put(3, "Mango");
        tm.put(4, "Orange");

        // Reverse (descending) view
        NavigableMap<Integer, String> desc = tm.descendingMap();

        System.out.println(desc);

    }

}

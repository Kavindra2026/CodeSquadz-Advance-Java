import java.util.HashMap;
import java.util.Map;

public class Q5KeySetAndValues {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");

        System.out.println("Iterating Using KeySet() :");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println("\nIterating using values():");
        for (String value : map.values()) {
            System.out.println(value);
        }
    }

}

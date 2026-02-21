import java.util.HashMap;
import java.util.Map;

public class Q4EntrySetIteration {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");

        System.out.println("Iterating using EnterSet : ");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q7HashMapToTreeMap {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10, "Ten");
        hashMap.put(1, "One");
        hashMap.put(25, "TwentyFive");
        hashMap.put(3, "Three");
        hashMap.put(2, "Two");
        System.out.println("\n HashMap unsorted: " + hashMap);

        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("\n TreeMap sorted by key: " + treeMap);

    }
}
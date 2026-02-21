import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q4 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Kavindra");
        map.put(2, "Kavindra");

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        set.add(10);
        set.add(10);
        set.add(30);
        set.add(40);
        System.out.println(set);

    }

}

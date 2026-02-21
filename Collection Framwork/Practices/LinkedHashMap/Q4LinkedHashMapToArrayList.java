import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Q4LinkedHashMapToArrayList {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        List<Integer> keys = new ArrayList<>(map.keySet());
        List<String> values = new ArrayList<>(map.values());
        System.out.println(keys);
        System.out.println(values);

    }
}

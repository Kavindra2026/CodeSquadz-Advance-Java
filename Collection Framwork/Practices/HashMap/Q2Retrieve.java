import java.util.HashMap;
import java.util.Map;

public class Q2Retrieve {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        String value = map.get(2);
        System.out.println(value);

    }
}

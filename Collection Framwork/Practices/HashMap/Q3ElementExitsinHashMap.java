import java.util.HashMap;
import java.util.Map;

public class Q3ElementExitsinHashMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        Boolean hashKey = map.containsKey(3);

        boolean hashValue = map.containsValue("Mango");
        System.out.println("Contains key : " + hashKey);
        System.out.println("Contains Value : " + hashValue);

    }

}

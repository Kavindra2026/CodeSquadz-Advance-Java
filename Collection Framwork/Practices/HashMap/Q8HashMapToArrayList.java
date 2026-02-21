import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 

public class Q8HashMapToArrayList {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");

        List<Integer> Keylist = new ArrayList<>(map.keySet());

        List<String> valueList = new ArrayList<>(map.values());
        System.out.println("Keys ArrayList : " + Keylist);
        System.out.println("Value ArrayList : " + valueList);

    }
}
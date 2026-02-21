import java.util.Map;
import java.util.TreeMap;

public class Q1AddElement {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map);
    }
}
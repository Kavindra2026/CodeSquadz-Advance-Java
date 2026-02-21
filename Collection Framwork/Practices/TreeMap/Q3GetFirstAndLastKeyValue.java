import java.util.TreeMap;

public class Q3GetFirstAndLastKeyValue {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(3, "C");
        tm.put(1, "A");
        tm.put(2, "B");

        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());

    }

}

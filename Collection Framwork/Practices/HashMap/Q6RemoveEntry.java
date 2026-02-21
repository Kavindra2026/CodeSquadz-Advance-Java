import java.util.HashMap;
import java.util.Map;

public record Q6RemoveEntry() {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        // Remove by key
        // String removed = map.remove(2);
        // System.out.println("Removee : " + removed);
        // System.out.println("Map after removal: " + map);

        // Remove by key and value

        boolean removes = map.remove(2, "Banana");
        System.out.println("Removee : " + removes);
        System.out.println("Map after removal: " + map);

    }

}

import java.util.LinkedList;
import java.util.List;

public class Q18ArrayToLinkedList {
    public static void main(String[] args) {
        String[] arr = { "A", "B", "C" };
        List<String> list = new LinkedList<>();
        for (String s : arr) {
            list.add(s);
        }
        System.out.println(list);

        // List<String> list = new LinkedList<>(Arrays.asList(arr));
        // System.out.println(list);
    }

}

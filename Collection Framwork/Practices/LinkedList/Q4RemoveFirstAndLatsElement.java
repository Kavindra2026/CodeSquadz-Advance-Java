import java.util.LinkedList;
import java.util.List;

public class Q4RemoveFirstAndLatsElement {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After Remove: " + list);

    }
}
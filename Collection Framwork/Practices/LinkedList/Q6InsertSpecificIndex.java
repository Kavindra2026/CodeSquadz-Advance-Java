import java.util.LinkedList;
import java.util.List;

public class Q6InsertSpecificIndex {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Insert at a specific index

        list.add(2, 50);
        System.out.println(list);

        // Remove element at given index

        list.remove(3);
        System.out.println(list);
    }

}

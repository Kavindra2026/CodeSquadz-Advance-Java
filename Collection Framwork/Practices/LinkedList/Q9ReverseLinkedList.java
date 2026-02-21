import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Q9ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        /// Using Collections.reverse()

        System.out.println("Using Collections.reverse()");
        Collections.reverse(list);
        System.out.println(list);

        // Using Iteration
        System.out.println("Using Iteration");

        LinkedList<String> reversed = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        System.out.println(reversed);

    }
}

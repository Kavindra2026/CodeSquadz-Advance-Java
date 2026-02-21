import java.util.Collections;
import java.util.LinkedList;

public class Q14SortLinkedListElement {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);

        Collections.sort(list);

        /// For Reverse

        // Collections.sort(list, Collections.reverseOrder());

        System.out.println("After Sorting " + list);




        // for String

        LinkedList<String> names = new LinkedList<>();
        names.add("Kavindra");
        names.add("Savej ");
        names.add("Pramod");

        Collections.sort(names);
        System.out.println(names);

    }

}

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Q13RemoveDuplicate {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");

        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(set);

    }

}

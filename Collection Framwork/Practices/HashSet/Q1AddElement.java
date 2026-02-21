import java.util.HashSet;
import java.util.Set;

public class Q1AddElement {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");

        System.out.println(set);

    }
}
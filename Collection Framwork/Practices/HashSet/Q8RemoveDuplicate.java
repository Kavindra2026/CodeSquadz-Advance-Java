import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q8RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B", "D");
        Set<String> set = new HashSet<>(list);
        System.out.println("Original List: " + list);
        System.out.println("Unique Set: " + set);
    }
}

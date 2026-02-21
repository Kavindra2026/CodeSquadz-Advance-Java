import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q8 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        Set<Integer> set = new HashSet<>(nums);
        System.out.println(set);
    }
}

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q3RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20);
        Set<Integer> set=new LinkedHashSet<>(list);
        System.out.println(set);

    }
}

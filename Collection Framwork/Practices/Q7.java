import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "C", "B");

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
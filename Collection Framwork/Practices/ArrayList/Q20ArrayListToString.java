import java.util.Arrays;
import java.util.List;

public class Q20ArrayListToString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        String result = String.join(", ", list);
        System.out.println(result);



        System.out.println(list.toString());

    }

}

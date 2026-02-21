import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q21FilterEvenElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 5, 7, 8, 3, 9);

        List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(even);

    }

}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q22ConvertUpperCaseByMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Kavindra", "Pramod", "Sarthak");
        List<String> upper = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        // List<String> upper = list.stream()
        // .map(s -> s.toUpperCase())
        // .collect(Collectors.toList());

        System.out.println(upper);
    }

}

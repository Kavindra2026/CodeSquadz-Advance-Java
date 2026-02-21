import java.util.ArrayList;
import java.util.List;

public class CheckElement {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);

        System.out.println(number.contains(20));

    }
}

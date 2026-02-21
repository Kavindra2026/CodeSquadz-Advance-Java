import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q10FindMaxMin {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kavindra");
        list.add("Savaj Ali");
        list.add("Harsh");
        list.add("Pramod");

        String min = Collections.min(list);
        String max = Collections.max(list);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}

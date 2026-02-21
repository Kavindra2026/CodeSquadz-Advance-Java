import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7ArrayListToArray {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Kavindra");
        list.add("Savaj Ali");
        list.add("Harsh");
        list.add("Pramod");

        System.out.println(list.getClass().getName());

        // convert and print array
        System.out.println(Arrays.toString(list.toArray()));

        // print list normally
        System.out.println(list);

    }

}

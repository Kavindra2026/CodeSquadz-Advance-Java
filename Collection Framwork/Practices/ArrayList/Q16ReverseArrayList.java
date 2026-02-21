import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q16ReverseArrayList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D");
        System.out.println("Original : " + list);

        /// Using Collections.reverse()
        System.out.println("Using Collections.reverse() ---------------------");
        Collections.reverse(list);
        System.out.println(list);

        /// Using for loop (without built-in)
        System.out.println("Using for loop (without built-in)---------------------------------");
        List<String> reversed = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));

        }
        System.out.println(reversed);

    }

}

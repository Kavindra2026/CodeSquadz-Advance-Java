import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q9SortArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Kavindra");
        list.add("Savaj Ali");
        list.add("Harsh");
        list.add("Pramod");

        // Sort For Assending Order//
        Collections.sort(list);

        // Sort For Deassending Order//

        // Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}

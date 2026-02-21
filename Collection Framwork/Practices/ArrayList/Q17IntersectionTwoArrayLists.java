import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Q17IntersectionTwoArrayLists {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60));

        list1.retainAll(list2);
        System.out.println(list2);
        System.out.println(list1);

    }

}

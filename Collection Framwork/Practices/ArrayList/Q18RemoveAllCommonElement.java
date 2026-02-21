import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18RemoveAllCommonElement {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        System.out.println("Before reomve Element ----------------------------");
        System.out.println(list1);

        System.out.println(list1.removeAll(list1));

        System.out.println(" After reomve Element-------------------------");
        System.out.println(list1);

    }
}

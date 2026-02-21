import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q17LinkedListToArray {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        String arr[] = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

    }

}

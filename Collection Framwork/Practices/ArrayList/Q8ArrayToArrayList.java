import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Q8ArrayToArrayList {

    public static void main(String[] args) {

        // When Array Integer ho

        int arr[] = { 10, 20, 30, 40, 50 };
        List<Integer> list = new ArrayList<>();
        for (Integer n : arr) {
            list.add(n);
        }
        System.out.println(list);

        // When Array String ho
        String arr1[] = { "A", "B", "C" };
        List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(list1);

    }

}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q23SortUsingComparator {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Kiwi", "Banana", "Mango");
        list.sort(Comparator.comparingInt(String::length));
        // list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(list);
    }
}
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q11RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B", "D");
        System.out.println(list);

        System.out.println("Remove Duplicates by LinkedHashSet ------");
        Set<String> linkedSet = new LinkedHashSet<>(list);
        System.out.println(linkedSet);

        System.out.println("Remove Duplicates by HashSet ------");
        Set<String> set = new HashSet<>(list);
        System.out.println(set);

        /// Method Stream ka use
        System.out.println("Remove Duplicates by Stream ------");
        List<String> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);

    }
}
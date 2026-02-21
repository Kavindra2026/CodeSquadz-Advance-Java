import java.util.LinkedList;
import java.util.List;

public class Q8SearchElement {

    public static void main(String[] args) {

        // For integer

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.contains(30));

        // For String
        System.out.println("Search an element in List");
        List<String> list2 = new LinkedList<>();
        list2.add("Kavindra Singh");
        list2.add("Savej");
        list2.add("Pramod");

        String search = "Kavindra Singh";

        if (list2.contains(search)) {
            System.out.println(search + " found in list");
        } else {
            System.out.println(search + " not found in list");
        }
    }

}

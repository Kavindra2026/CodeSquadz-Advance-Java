import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Q2PrintAllElement {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // 1. Using for-each loop
        System.out.println("Using for-each loop ----------");
        for (Integer num : list) {
            System.out.println(num);
        }

        // 2. Using Iterator
        System.out.println("Using Iterator ----------");
        Iterator<Integer> li = list.iterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        // 3. Stream
        System.out.println("Using Stream ----------");
        list.stream().forEach(System.out::println);

    }

}

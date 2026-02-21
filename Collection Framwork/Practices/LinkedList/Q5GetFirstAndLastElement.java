import java.util.LinkedList;
import java.util.List;

public class Q5GetFirstAndLastElement {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("First Element " + list.getFirst());
        System.out.println("Last Element " + list.getLast());

    }

}

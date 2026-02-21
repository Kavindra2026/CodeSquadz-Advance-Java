import java.util.ArrayList;
import java.util.List;

public class Q4RemoveElement {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Kavindra");
        list.add("Savaj Ali");
        list.add("Harsh");
        list.add("Pramod");

        System.out.println(list.remove(2));
        System.out.println(list.remove("Pramod"));

        System.out.println(list);

    }

}

import java.util.ArrayList;
import java.util.List;

public class Q6Replace {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Kavindra");
        list.add("Savaj Ali");
        list.add("Harsh");
        list.add("Pramod");

        System.out.println(list.set(1, "Anas Khan"));
        System.out.println(list);
        for (String name : list) {
            System.out.println(name);
        }

    }
}

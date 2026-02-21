import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(50);
        num.add(20);
        num.add(80);

        Collections.sort(num);
        System.out.println(num);
    }

}

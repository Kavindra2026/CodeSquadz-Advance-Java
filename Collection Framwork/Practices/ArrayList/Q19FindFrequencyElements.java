import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q19FindFrequencyElements {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 10, 20, 30, 20, 10, 40));

        System.out.println("10 => " + Collections.frequency(list, 10));
        System.out.println("20 => " + Collections.frequency(list, 20));
        System.out.println("30 => " + Collections.frequency(list, 30));
        System.out.println("40 => " + Collections.frequency(list, 40));

    }
}

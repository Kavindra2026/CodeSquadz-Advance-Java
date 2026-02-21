import java.util.ArrayList;

public class Q13CloneArrayList {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        ArrayList<String> list2 = (ArrayList<String>) list1.clone();

        // Using clone()
        System.out.println(list1);
        System.out.println("Using clone() ----------------");
        System.out.println(list2);

        /// Using Copy Constructor
        System.out.println("Using Copy Constructor-------------");
        ArrayList<String> list3 = new ArrayList<>(list1);
        System.out.println(list3);

        /// Using addAll()
        System.out.println("Using addAll()-------------");
        ArrayList<String> list4 = new ArrayList<>();
        list4.addAll(list1);
        System.out.println(list4);

    }

}

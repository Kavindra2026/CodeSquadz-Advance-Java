import java.util.Vector;

public class Q4InsertElementSpecific {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

        System.out.println("Original: " + vector);

        vector.add(3,"Z");
        System.out.println("After add " + vector);



    }

}

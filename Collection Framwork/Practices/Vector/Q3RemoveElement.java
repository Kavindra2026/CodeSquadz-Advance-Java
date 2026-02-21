import java.util.Vector;

public class Q3RemoveElement {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("B");

        System.out.println("Original : " + vector);

        // 1. remove by index
        vector.remove(1);
        System.out.println("After remove : " + vector);

        // 2. remove by object/value
        vector.remove("B");
        System.out.println("After remove(\"B\"): " + vector);

    }
}
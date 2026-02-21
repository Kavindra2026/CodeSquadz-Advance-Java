import java.util.HashMap;
import java.util.Map;

public class Q10DuplicateElement {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 4, 1, 5, 3 };

        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Count frequency

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        }
        System.out.println(freqMap);

        // Step 2: Find duplicates
        // for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        //     if (entry.getValue() > 1) {
        //         System.out.println(entry.getKey() + " → " + entry.getValue());

        //     }
        // }

    }

}
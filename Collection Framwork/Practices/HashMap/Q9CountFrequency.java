// import java.util.HashMap;
// import java.util.Map;

// public class Q9CountFrequency {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 2, 1, 4, 2, 3 };

//         Map<Integer, Integer> freqMap = new HashMap<>();
//         for (int num : arr) {
//             if (freqMap.containsKey(num)) {
//                 freqMap.put(num, freqMap.get(num) + 1);

//             } else {
//                 freqMap.put(num, 1);
//             }
//         }
//         System.out.println(freqMap);

//     }

// }

import java.util.HashMap;
import java.util.Map;

public class Q9CountFrequency {
    public static void main(String[] args) {

        String sentence = "apple banana apple mango banana apple";

        String[] words = sentence.split(" ");

        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            if (freqMap.containsKey(word)) {
                freqMap.put(word, freqMap.get(word) + 1);
            } else {
                freqMap.put(word, 1);
            }
        }

        System.out.println(freqMap);
    }
}

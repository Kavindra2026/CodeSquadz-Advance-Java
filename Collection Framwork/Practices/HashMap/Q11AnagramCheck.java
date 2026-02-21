import java.util.HashMap;
import java.util.Map;

public class Q11AnagramCheck {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1, s2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    static boolean areAnagrams(String s1, String s2) {

        // Step 1: Length check
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        // Step 2: Count chars of first string
        for (char c : s1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 3: Reduce count using second string
        for (char c : s2.toCharArray()) {

            if (!freqMap.containsKey(c)) {
                return false; // char not found
            }

            freqMap.put(c, freqMap.get(c) - 1);

            if (freqMap.get(c) == 0) {
                freqMap.remove(c);
            }
        }

        // Step 4: If map empty → anagram
        return freqMap.isEmpty();
    }
}

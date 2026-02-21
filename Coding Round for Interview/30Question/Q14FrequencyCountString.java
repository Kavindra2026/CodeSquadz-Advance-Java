public class Q14FrequencyCountString {
    public static void main(String[] args) {

        String s = "Kavindra  Singh";
        s = s.replaceAll(" ", "");
        int fre[] = new int[256];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            fre[s.charAt(i)]++;
        }

        // Print in string order
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (fre[ch] != 0) {
                System.out.println(ch + " = " + fre[ch]);
                fre[ch] = 0; // avoid duplicate printing
            }
        }
    }
}

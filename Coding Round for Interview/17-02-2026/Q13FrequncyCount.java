public class Q13FrequncyCount {
    public static void main(String[] args) {
        String s = "Kavindra";

        int fre[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fre[ch]++;
        }

        // Print frequency
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] > 0) {
                System.out.println((char) i + " = " + fre[i]);
            }
        }

    }

}

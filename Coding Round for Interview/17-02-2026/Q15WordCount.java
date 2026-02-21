public class Q15WordCount {
    public static void main(String[] args) {
        String s = "I Love Java";
        s.trim();
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }

        }
        System.out.println(count);
    }

}


// String s = " I love Java ";
// String[] words = s.trim().split("\\s+");
// System.out.println(words.length);

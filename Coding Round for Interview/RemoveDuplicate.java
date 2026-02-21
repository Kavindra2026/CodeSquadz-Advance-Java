public class RemoveDuplicate {
    public static void main(String[] args) {

        String s = "aaabbbccczzxxzzccaa";

        for (int i = 0; i < s.length(); i++) {

            boolean isDuplicate = false;

            // check previous characters
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // print only if not duplicate
            if (!isDuplicate) {
                System.out.print(s.charAt(i));
            }
        }
    }
}

// public class RemoveDuplicate {
// public static void main(String[] args) {
// String s = "aaabbbccczzxx";
// String result = "";
// for (char ch : s.toCharArray()) {
// if (result.indexOf(ch) == -1) {
// result += ch;
// }
// }
// System.out.println(result);
// }
// }
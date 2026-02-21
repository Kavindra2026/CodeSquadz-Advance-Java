
public class Q22RemoveDuplicate {
    public static void main(String[] args) {
        String s = "aadbdbdbdfbfbfbfbfb";
        for (int i = 0; i < s.length(); i++) {
            boolean isDuplicate = false;

            // check prevous characters
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // print only if not dupicate
            if (!isDuplicate) {
                System.out.print(s.charAt(i) + " ");

            }

        }

    }

}

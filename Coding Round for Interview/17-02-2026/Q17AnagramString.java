import java.util.Arrays;

public class Q17AnagramString {
    public static void main(String[] args) {
        String s = "listen";
        String s1 = "silent";
        s = s.toLowerCase();
        s1 = s1.toLowerCase();
        char a[] = s.toCharArray();
        char b[] = s1.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean isAnagram = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String not Anagram");
        }

    }

}

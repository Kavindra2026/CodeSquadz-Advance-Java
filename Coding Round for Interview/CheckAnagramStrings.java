import java.util.Arrays;

public class CheckAnagramStrings {
    public static void main(String[] args) {
        String s = "Listen", s2 = "Silent";

        s = s.toLowerCase();
        s2 = s2.toLowerCase();

        char a[] = s.toCharArray();
        char b[] = s2.toCharArray();
        System.out.println(a);
        System.out.println(b);

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Anagram" : "Not Anagram");

    }

}

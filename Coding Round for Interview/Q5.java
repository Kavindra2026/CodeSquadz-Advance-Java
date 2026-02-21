public class Q5 {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            rev = rev + s.charAt(i);

        }
        System.out.println(s.equals(rev) ? "Is Palindrome" : "not Palindrome");
    }
}

// public class Palindrome {

// // For Number ke Palindrome
// public static void main(String[] args) {
// int n = 121;
// int temp = n;
// int rev = 0;

// while (n > 0) {
// rev = rev * 10 + n % 10;
// n /= 10;
// }

// System.out.println(temp == rev ? "Is Palndrome" : "Not Palndrome");

// }
// }

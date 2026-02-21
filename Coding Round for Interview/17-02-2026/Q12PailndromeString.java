public class Q12PailndromeString {
    public static void main(String[] args) {
        int start = 0;
        String s = "madam";
        int end = s.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");
        }

    }

}

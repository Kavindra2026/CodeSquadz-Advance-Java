public class Q5Palindrome {

    public static void main(String[] args) {
        int n = 121, temp=n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");
        }

    }
}

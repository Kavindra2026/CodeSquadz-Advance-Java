import java.util.Scanner;

public class Q7PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0, temp=n;
        while (n > 0) {
            int lastDigit = n % 10;

            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        if (temp == rev) {
            System.out.println("Numbrer ia Palindrome");
        } else {
            System.out.println("Not  Palindrome number");
        }

    }

}

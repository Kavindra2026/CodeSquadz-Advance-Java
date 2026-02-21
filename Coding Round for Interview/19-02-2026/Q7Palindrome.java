public class Q7Palindrome {

    public static void main(String[] args) {
        int n = 121,rev=0 ,temp=n;
        while (n>0) {
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }

        System.out.println(temp==rev ?"Palindrme": "Not Palindrome");

    }
}
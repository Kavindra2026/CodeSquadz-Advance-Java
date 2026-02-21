public class CountDigits {

    public static void main(String[] args) {
        int n = 1888234, count = 0;

        while (n > 0) {
            count++;
            n /= 10;

        }
        System.out.println(count);
    }
}
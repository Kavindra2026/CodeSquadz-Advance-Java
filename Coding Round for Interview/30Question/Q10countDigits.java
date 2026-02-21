public class Q10countDigits {
    public static void main(String[] args) {
        int n = 12356, count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);

    }

}

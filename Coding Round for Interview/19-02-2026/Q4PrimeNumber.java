public class Q4PrimeNumber {

    public static void main(String[] args) {
        int n = 6;
        boolean isPrime = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        System.out.println(isPrime ? "Prime" : "Not Prime");

    }
}
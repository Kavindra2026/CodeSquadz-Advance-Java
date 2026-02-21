public class Q3PrimeNumber {
    public static void main(String[] args) {
        int n = 3;
        boolean isPrime = true;
        for (int i = 2; i < n / 2; i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime " : " Not Prime ");

    }

}

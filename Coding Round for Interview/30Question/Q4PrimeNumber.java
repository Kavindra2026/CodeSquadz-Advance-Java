public class Q4PrimeNumber {
    public static void main(String[] args) {

        int n = 5;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println("Number is Prime: " + n);
        else
            System.out.println("Number is Not Prime");
    }
}

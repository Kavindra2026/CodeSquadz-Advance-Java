public class Q10CountOfDigit {
    public static void main(String[] args) {
        int n = 1255, count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("Count : "+count);

    }

}

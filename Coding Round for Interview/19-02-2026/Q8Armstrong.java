public class Q8Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n, sum = 0;
        while (n > 0) {

            int r = n % 10;
            sum += r * r * r;
            n /= 10;

        }
        System.out.println(temp == sum ? " Armstrong" : "Not Armstrong");

    }

}

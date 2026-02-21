public class CheckArmstrong {
    public static void main(String[] args) {

        int n = 153, temp = n, sum = 0;
        while (n > 0) {
            int R = n % 10;
            sum += R * R * R;
            n /= 10;
        }
        System.out.println(sum == temp ? "Armstrong" : " Not Armstrong");
    }
}

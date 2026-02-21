public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 10, 40, 20, 50, 80 };
        int first = 0, second = 0;

        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }

        System.out.println(second);

    }

}

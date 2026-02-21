public class Q3Fibbonnchi {
    public static void main(String[] args) {

        int a = 0, b = 1;
        int n = 8;

        for (int i = 1; i <= n; i++) {
            int c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;

        }

    }
}

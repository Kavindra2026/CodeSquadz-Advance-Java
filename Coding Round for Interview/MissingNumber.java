public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 50 };
        int n = 5;

        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        System.out.println(totalSum - actualSum);
    }

}

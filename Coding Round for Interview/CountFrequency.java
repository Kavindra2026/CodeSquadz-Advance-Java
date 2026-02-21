import java.util.Arrays;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 2, 2 };
        Arrays.sort(arr);

        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + " = " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " = " + count);
    }
}
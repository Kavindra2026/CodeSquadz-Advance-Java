
import java.util.Arrays;

public class Q13FrequencyCount {
    public static void main(String[] args) {
        int arr[] = { 8, 5, 4, 8, 3, 8, 2, 2, 8, 2 };

        int fre = 1;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                fre++;
            } else {
                System.out.println(arr[i] + " = " + fre);
                fre = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " = " + fre);
    }

}

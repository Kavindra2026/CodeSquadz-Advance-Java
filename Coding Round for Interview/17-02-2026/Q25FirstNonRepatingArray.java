public class Q25FirstNonRepatingArray {
    public static void main(String[] args) {

        int arr[] = { 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 4, 7, 4, 4, 4, 2, 2, 4, 4, 4, 4, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (!alreadyPrinted) {
                System.out.println(arr[i]);
                return;
            }

        }

    }

}

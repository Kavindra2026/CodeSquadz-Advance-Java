public class Q21FindDuplicateInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 8, 5, 7, 5, 5, };
        for (int i = 0; i < arr.length; i++) {
            boolean alReadyPrinted = false;

            // element pehle print ho chuka hai
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alReadyPrinted = true;
                    break;
                }
            }

            // skip
            if (alReadyPrinted)
                continue;

            // aage duplicate exist karta hai
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplocate nnumber: " + arr[i]);
                    break;

                }
            }

        }

    }
}

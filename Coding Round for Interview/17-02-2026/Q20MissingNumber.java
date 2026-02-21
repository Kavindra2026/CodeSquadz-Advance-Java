public class Q20MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7 };
        int n = arr.length + 1;
        int ActulSum = 0;
        int ToatlSum = n * (n + 1) / 2;
        for (int j = 0; j < arr.length; j++) {

            ActulSum += arr[j];

        }
        int missingNum = ToatlSum - ActulSum;
        System.out.println(missingNum);
    }

}

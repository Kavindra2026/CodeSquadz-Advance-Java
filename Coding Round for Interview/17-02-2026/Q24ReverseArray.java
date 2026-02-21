import java.util.Arrays;

public class Q24ReverseArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 0 };
        int start = 0, end = a.length - 1;
        while (start < end) {
            int c = a[start];
            a[start] = a[end];
            a[end] = c;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }
}

// import java.util.Arrays;

// public class Q24ReverseArray {
// public static void main(String[] args) {
// int a[] = {1, 2, 3, 4, 5, 6, 0};

// int start = 0, end = a.length - 1;

// while (start < end) {
// int temp = a[start]; // store first value
// a[start] = a[end]; // put last value in first
// a[end] = temp; // put stored value in last

// start++;
// end--;
// }

// System.out.println(Arrays.toString(a));
// }
// }

public class Q4SwapNumber {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.println("Before");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

}

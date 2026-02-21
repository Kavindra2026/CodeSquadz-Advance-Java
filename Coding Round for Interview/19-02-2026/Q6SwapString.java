public class Q6SwapString {

    public static void main(String[] args) {
        String s = "Kavindra";
        String s1 = "Sarthak";

        s = s + s1; // KavindraSarthak
        s1 = s.substring(0, s.length() - s1.length()); // Kavindra
        s = s.substring(s1.length()); // Sarthak

        System.out.println(s);
        System.out.println(s1);

    }

}

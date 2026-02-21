public class Q16SwapString {
    public static void main(String[] args) {
        
        String s="Kavindra";
        String s1="Sarthak";
             System.out.println(s);
        System.out.println(s1);
        s=s+s1;
        s1=s.substring(0, s.length()-s1.length());
        s=s.substring(s1.length());
        System.out.println(s);
        System.out.println(s1);

    }
    
}

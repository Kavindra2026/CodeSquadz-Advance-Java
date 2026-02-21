public class Q14VowelAndConsonentscount {
    public static void main(String[] args) {
        String s = "Kavindra";
        int v = 0, c = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }
        System.out.println("Vowel : " + v);
        System.out.println("Conconents : " + c);
    }
}
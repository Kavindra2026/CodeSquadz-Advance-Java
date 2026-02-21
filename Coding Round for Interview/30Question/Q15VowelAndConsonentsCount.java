public class VowelAndConsonentsCount {
    public static void main(String[] args) {
        String s = "Kavindra Singh";
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }
        System.out.println("Vowel : " + v);
        System.out.println("Consonents : " + c);
    }
}

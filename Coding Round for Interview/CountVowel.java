public class CountVowel {
    public static void main(String[] args) {
        String s = "Kavindra";
        s = s.toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);

    }

}

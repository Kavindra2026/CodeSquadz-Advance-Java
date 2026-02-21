class Q1OddEven {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6, 7 };
        String Even = "", Odd = "";
        for (int i = 0; i < n.length; i++) {

            if (n[i] % 2 == 0) {

                Even += n[i] + " ";

            } else {
                Odd += n[i] + " ";
            }
        }

        System.out.println("Even :" + Even);
        System.out.println("Even :" + Odd);

    }
}
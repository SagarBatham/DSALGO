public class SubStrLength {
    public static void main(String[] args) {
        String a="83415";

        for (int len = 1; len <=a.length(); len++) {
            for (int j =len; j <=a.length(); j++) {
                int i=j-len;
                System.out.println(a.substring(i, j));
            }
        }
    }
}

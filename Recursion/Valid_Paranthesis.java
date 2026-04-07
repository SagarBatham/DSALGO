public class Valid_Paranthesis {
    public static void main(String[] args) {
        validPal(2, 0, 0, "");
    }

    public static void validPal(int n, int left, int right, String str) {
        if (left == n && right == n) {
            System.out.println(str);
            return;
        }

        if (left < n) {
            validPal(n, left + 1, right, str + '(');

        }

        if (right < left) {
            validPal(n, left, right + 1, str + ')');
        }

    }
}

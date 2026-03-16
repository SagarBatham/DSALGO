public class Pow_Int {
    public static void main(String[] args) {
        int x = 3;
        int n = 3;
        System.out.println(pow(3, 3));
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }
}

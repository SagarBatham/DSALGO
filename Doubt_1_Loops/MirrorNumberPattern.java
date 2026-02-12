public class MirrorNumberPattern {
    public static void main(String[] args) {

        int n = 5;          // height (must be odd)
        int i = 1;
        int space = n / 2; // starting spaces
        int val = 1;       // number to start from

        while (i <= n) {

            // print spaces
            int s = 1;
            while (s <= space) {
                System.out.print("  ");
                s++;
            }

            // increasing numbers
            int num = val;
            int k = 1;
            while (k <= val) {
                System.out.print(num + " ");
                num++;
                k++;
            }

            // decreasing numbers
            num -= 2;
            k = 1;
            while (k < val) {
                System.out.print(num + " ");
                num--;
                k++;
            }

            System.out.println();

            // update logic
            if (i <= n / 2) {
                space--;
                val++;
            } else {
                space++;
                val--;
            }

            i++;
        }
    }
}

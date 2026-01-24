public class Loop_7 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int space=8;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int star=1;
            while(star<=i){
                System.out.print("* ");
                star++;
            }
            space-=2;
            i++;
            System.out.println("");
        }
    }
}

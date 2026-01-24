public class Loop_8 {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int space=4;
        int star=1;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            star+=2;
            i++;
            space--;
            System.out.println("");
        }
    }
}

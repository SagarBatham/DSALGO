public class Loop_9 {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int space=0;
        int star=9;
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
            star-=2;
            i++;
            space++;
            System.out.println("");
        }
    }
}

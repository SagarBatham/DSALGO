public class Loop_12 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int star=1;
        int space=2*n-3;
        while(i<=n){
            int j=1;
            while (j<=star) { 
                System.out.print("* ");
                j++;
            }
            int k=1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            int l=1;
            if(i==n){
                l=2;
            }
            while(l<=star){
                System.out.print("* ");
                l++;
            }
            star++;
            space-=2;
            i++;
            System.out.println("");
        }
    }
}

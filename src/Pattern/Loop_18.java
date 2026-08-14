public class Loop_18 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int star=n-1;
        int space=-1;
        while(i<=2*n-3){
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            int k=1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            int l=1;
            if(i==1||i==2*n-3){
                l=2;
            }
            while(l<=star){
                System.out.print("* ");
                l++;
            }
            if(i<n-1){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
            i++;
            System.out.println("");
        }
    }
}

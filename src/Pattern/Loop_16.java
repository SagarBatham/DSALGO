public class Loop_16 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int star=5;
        int space=n-1;
        while(i<=2*n-1){
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
            if(i<n){
                space--;
                star--;
            }else{
                star++;
                space++;
            }
            i++;
            System.out.println("");
        }
    }
}

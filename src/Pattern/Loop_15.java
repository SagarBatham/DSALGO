public class Loop_15 {
    public static void main(String[] args) {
        int n=5;
        int star=5;
        int i=1;
        int space=0;
        while(i<=2*n-1){
            int k=1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(i<n){
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

public class Loop_17 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int star=3;
        int space=1;
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
            j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
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

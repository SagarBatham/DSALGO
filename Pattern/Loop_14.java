public class Loop_14 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int star=1;
        while(i<=2*n-1){
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
        //Mirror Concept
        if(i<n){
            star++;
        }else{
            star--; 
        }
        i++;
        System.out.println();
        }
    }
}

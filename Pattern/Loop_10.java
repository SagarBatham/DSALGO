

public class Loop_10 {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int space=n-1;
        int star=1;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=star){
                if(k%2==0){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
                
                k++;
            }
            star+=2;
            i++;
            space--;
            System.out.println("");
        }
    }
}

public class Num_23{
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int star=1;
        int space=n-1;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            int val=1;
            while(k<=star){
                System.out.print(val+ " ");
                if(k<=(star/2)){
                    val++;
                }else{
                    val--;
                }
                k++;  
                 
            }
            i++;
            space--;
            star+=2;
            System.out.println("");
        }
    }
}



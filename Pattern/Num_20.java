public class Num_20 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int num=1;
        int space=n-1;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=num){
                System.out.print(i+ " ");
                k++;    
            }
            i++;
            space--;
            num+=2;
            System.out.println("");
        }
    }
}

public class Loop_4 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i<=n){
            int j=n-1,k=1;
            while (j>=i) { 
                System.out.print("  ");
                j--;
            }
            while (k<=i) { 
                System.out.print("* ");
                k++;
            }
            i++;
            System.out.println("");
        }
    }
}

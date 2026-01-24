public class MountNum {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        int space=2*n-3;
        int row=1;
        while(row<=n){
            int i=1;
            int val=1;
            while(i<=num){
                System.out.print(val+" ");
                i++;
                val++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
             val--;
            if(i==n+1){
                k=2;
                val--;
            }
            while(k<=num){
                System.out.print(val+" ");
                val--;
                k++;
            }
            num++;
            row++;
            space-=2;
            System.out.println();
        }
    }
}

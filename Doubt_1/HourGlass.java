public class HourGlass {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int num=1;
        int space=2*n-1;
        while(row<=2*n+1){
            int i=1;
            int val=5;
            while(i<=num){
                System.out.print(val+" ");
                val--;
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("| ");
                j++;
            }
            int k=1;
            if(row==n+1){
                k=2;
                val++;
            }
            
            val++;
            while (k<=num) { 
                System.out.print(val+" ");
                val++;
                k++;
            }
            if(row<n+1){
                num++;
                space-=2;
            }else{
                num--;
                space+=2;
            }
            row++;
            System.out.println();
        }
    }
}

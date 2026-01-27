import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        int row=1;
        int space=n-1;
        int inSpace=-1;
        while(row<=n){
            int val=num;
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=num){
                System.out.print(val+" ");
                val--;
                j++;
            }
            int k=1;
            while(k<=inSpace){
                System.out.print("  ");
                k++;
            }
            int l=1;
            val=1;
            if(row==1||row==n){
                l=2;
            }
            while(l<=num){
                System.out.print(val+" ");
                val++;
                l++;
            }
            if(row<n/2+1){
                num++;
                space-=2;
                inSpace+=2;
            }else{
                num--;
                space+=2;
                inSpace-=2;
            }
            row++;
            System.out.println();
        }
    }
}

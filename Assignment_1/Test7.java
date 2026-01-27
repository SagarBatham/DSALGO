import java.util.*;
public class Test7{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=2*n-3;
        while(row<=n){
            int i=1;
            int num=1;
            while(i<=row){
                System.out.print(num+"\t");
                i++;
                num++;
            }
            int j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            num--;
            int val=num;
            int k=1;
            if(row==n){
                val--;
                k=2;
            }
            while(k<=row){
                System.out.print(val+"\t");
                k++;
                val--;
            }
            space-=2;
            row++;
            System.out.println();
        }
    }
}
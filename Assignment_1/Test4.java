import java.util.*;
public class Test4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n;
        int outspace=n-1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=outspace){
                System.out.print("\t");
                i++;
            }
            if(row==1||row==n){
                int k=1;
                while(k<=star){
                System.out.print("*\t");
                k++;
            }
            }else{
                int k=1;
                System.out.print("*\t");
                while(k<=star-2){
                System.out.print("\t");
                k++;
                }
                System.out.print("*\t");
            }
            outspace--;
            row++;
            System.out.println();
    }
}
}
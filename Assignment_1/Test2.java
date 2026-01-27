import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int num=1;
        int space=n-1;
        while(row<=n){
            int s=1;
            while(s<=space){
                System.out.print("\t");
                s++;
            }
            int i=1;
            int val=num;
            while(i<=num){
                System.out.print(val+"\t");
                val++;
                i++;
            }
            val-=2;
            int j=1;
            while(j<num){
                System.out.print(val+"\t");
                val--;
                j++;
            }
            num++;
            space--;
            row++;
            System.out.println();
        }
    }
}

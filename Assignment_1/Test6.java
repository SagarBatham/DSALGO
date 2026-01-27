import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ele=1;
        int row=1;
        int a=0;
        int b=1;
        while(row<=n){
            int i=1;
            while(i<=ele){
                System.out.print(a+" ");
                int c=a+b;
                a=b;
                b=c;
                i++;
            }
            ele++;
            row++;
            System.out.println();
        }
    }
}

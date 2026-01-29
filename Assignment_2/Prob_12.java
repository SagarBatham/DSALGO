
import java.util.Scanner;

/*  the following as input.

A number (N1)
A number (N2)
Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3 */
public class Prob_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        armStrongNum(n, n2);
    }
    public static void armStrongNum(int n1,int n2) {
        for (int i = n1; i < n2; i++) {
            int sum=0;
            int n=i;
            int c=countDigit(n);
            while(n>0){
                int rem=n%10;
                sum=sum+(int)Math.pow(rem, c);
                n=n/10;
            }
            
            if(sum==i){
                System.out.println(sum);
            }
        }
    }
    public static int countDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}

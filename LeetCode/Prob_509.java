
import java.util.Scanner;

// 509. Fibonacci Number
public class Prob_509 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        int a=0;
        int b=1;
        while(n>0){
            int c=a+b;
            a=b;
            b=c;
            n--;
        }
        return a;
    }
}

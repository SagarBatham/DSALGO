// 1137. N-th Tribonacci Number

import java.util.Scanner;

public class Prob_1137 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tribonacci(n));
    }
    public static int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        while(n>0){
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
            n--;
        }
        return a;
    }
}

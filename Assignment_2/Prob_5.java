
import java.util.Scanner;

//Nth Fibonacci (Hard)
public class Prob_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        while(n>0){
            int c=a+b;
            a=b;
            b=c;
            n--;
        }
        System.out.println(a);
    }
}

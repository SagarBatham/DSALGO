
import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter which fibonacci number do you want: ");
        int nth=input.nextInt();
        int fib = 0;
        int a=0;
        int b=1;
        for (int i = 1; i <nth; i++) {
            if(nth==0){
                fib=0;
                break;
            }
            if(nth==1||nth==2){
                fib=1;
                break;
            }
            int c=a+b;
            //System.out.println(a);
            a=b;
            b=c;
            fib=c;
        }
        System.out.println(fib+"");
        input.close();
    }
}

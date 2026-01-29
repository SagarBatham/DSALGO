//LCM
import java.util.Scanner;

public class Prob_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(lcmfind(n1, n2));
        
    }
    public static int lcmfind(int n1,int n2) {
        int mul=n1*n2;
        int rem;
        while(n2>n1){
            rem=n2%n1;
            n1=rem;
            n2=n1;
        }
        int lcm=mul/n1;
        return lcm;
    }
}

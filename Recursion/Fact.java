import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        int factor=n;
        if(n==1 || n==0){
            return 1;
        }
        factor*=fact(n-1);
        return factor;
    }

}

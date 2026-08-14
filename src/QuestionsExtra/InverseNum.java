import java.util.*;
public class InverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int pos=1;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=(int)(sum+pos*Math.pow(10, rem-1));
            pos++;
            n=n/10;
        }
        //sum
        System.out.println(sum);
    }
}


import java.util.Scanner;

public class Prob_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sumofEvenPlaced(n);
    }
    public static void sumofEvenPlaced(int n){
        int dig=countDigit(n);
        int evenSum=0;
        int oddSum=0;
        while(dig>0){
            if(dig%2==0){
                int rem=n%10;
                evenSum=evenSum+rem;
                n=n/10;
            }else{
                int rem=n%10;
                oddSum=oddSum+rem;
                n=n/10;
            }
            dig--;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
    public static int countDigit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void sumofOddPlaced(int n){
        
    }
}

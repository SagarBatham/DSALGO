//Count Digits
import java.util.Scanner;

public class Prob_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int count=0;
        while(n>0){
            int temp=n%10;
            if(temp==key){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}

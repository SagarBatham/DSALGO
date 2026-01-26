
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(isArmstrong(n)){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
            }
        }
    

    public static boolean isArmstrong(int n){
        int count=0;
        int original=n;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int sum=0;
        for (; n>0; ) {
            int rem=n%10;
            sum=sum+(int)Math.pow(rem, count);
            n=n/10;
        }
        return sum==original;
    }     
}
        
    



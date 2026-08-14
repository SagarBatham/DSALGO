
import java.util.Scanner;

public class Prime_Num{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int l=0;
        for (int i = 2; i <n; i++) {
            if(n%i==0){
                l++;
            }
        }
        if(l>1){
            System.out.println("Non Prime");
        }else{
            System.out.println("Prime");
        }
        input.close();
    }
}
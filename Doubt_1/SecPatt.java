
import java.util.Scanner;

public class SecPatt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        int space=n-1;
        while(i<=n){
            
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int num=i;
            int k=1;
            while(k<=i){
                System.out.print(num+" ");
                k++;
                num++;
            }
            
            int l=1;
            num-=2;
            while(l<i){
                System.out.print(num+" ");
                l++;
                num--;
            }
            space--;
            i++;
            System.out.println();
            input.close();
        }
    }
}

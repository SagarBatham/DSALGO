
import java.util.Scanner;

public class Mirr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        int star=1;
        int space=n-1;
        while(i<=2*n-3){
            int j=1;
            while(j<=space){
                System.out.print("/ ");
                j++;
            }
            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(i<n/2+1){
                star+=2;
                space--;
            }else{
                star-=2;
                space++;
            }
            i++;
            System.out.println();
            input.close();
        }
    }
}

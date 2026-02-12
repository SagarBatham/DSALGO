
import java.util.Scanner;

public class FirstPatt {
    public static void main(String args[]) {
        // Your Code Here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        int star=n/2+1;
        int space=-1;
        while(i<=n){
            int j=1;
            while(j<=star){
                System.out.print("*\t");
                j++;
            }
            int k=1;
            while(k<=space){
                System.out.print("\t");
                k++;
            }
            
            int l=1;
            if(i==1||i==n){
                l=2;
            }
            while(l<=star){
                System.out.print("*\t");
                l++;
            }
            if(i<=(n/2)){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
            input.close();
            i++;
            System.out.println("");
        }
    }
}


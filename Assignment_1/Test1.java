import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int star=n/2+1;
        int space=-1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("*\t");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            int k=1;
            while(k<=star){
                System.out.print("*\t");
                k++;
            }
            if(row<n/2+1){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
            row++;
            System.out.println();
        }
    }
}

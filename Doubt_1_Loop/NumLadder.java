
import java.util.Scanner;

public class NumLadder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int num=1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(num+"\t");
                j++;
                num++;
            }
            i++;
            System.out.println();
            input.close();
        }
    }
}

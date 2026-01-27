
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=num){
                if(i==1||i==row){
                    System.out.print(num+" ");
                }else{
                    System.out.print("0 ");
                }
                i++;
            }
            row++;
            num++;
            System.out.println();
            }
        }
    }


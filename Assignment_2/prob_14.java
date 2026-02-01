
import java.util.Scanner;

// Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.


// Input Format

// Constraints
// 0 < N <= 1000000000
// sb and db <= 10


// Output Format

// Sample Input
// 8
// 2 
// 33
public class prob_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int source=sc.nextInt();
        int dest=sc.nextInt();
        int num=sc.nextInt();
        System.out.println(DecToBin(dest, source, num));
    }
    public static int soToDec(int source,int num) {
        int temp=num;
        int mul=1;
        int ans=0;
        while(temp>0){
            int rem=temp%10;
            ans=ans+rem*mul;
            temp=temp/10;
            mul=mul*source;
        }
        return ans;
    }
    public static int DecToBin(int destination,int source,int num) {
        int temp=soToDec(source,num);
        int mul=1;
        int ans=0;
        while(temp>0){
            int rem=temp%destination;
            ans=ans+rem*mul;
            temp=temp/destination;
            mul=mul*10;
        }
        return ans;
    }
}

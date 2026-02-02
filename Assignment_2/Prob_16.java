
import java.util.Scanner;

// Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible
//  by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria can't be done by 
// \the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?


// Input Format
// The first line contains N , then N integers follow each denoting the number of the car.


// Constraints
// N<=1000 Car No >=0 && Car No <=1000000000


// Output Format
// N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !


// Sample Input
// 2
// 12345
// 12134
// Sample Output
// Yes
// No
public class Prob_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int car=sc.nextInt();
            checkOddEvenCar(car);
        }
    }
    public static void checkOddEvenCar(int car){
        int n=car;
        int oddSum=0;
        int evenSum=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                evenSum+=rem;
            }else{
                oddSum+=rem;
            }
            n=n/10;
        }
        if(evenSum%4==0||oddSum%3==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

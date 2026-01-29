/*Given a integer as a input and replace all the '0' with '5' in the integer


Input Format
Enter an integer n


Constraints
0<=n<=1000000000000


Output Format
All zeroes are replaced with 5


Sample Input
102
Sample Output
152
Explanation
Check each digit , if it is nonzero, then no change required but if it is zero then replace it by 5.*/
public class Prob_8 {
    public static void main(String[] args) {
        int n=10006004;
        int newDigit=0;
        int mul=1;
        while(n>0){
            int rem=n%10;
            if(rem==0){
                rem=5;
            }
            newDigit=newDigit+rem*mul;
            mul=mul*10;
            n=n/10;
        }
        System.out.println(newDigit);
    }
}

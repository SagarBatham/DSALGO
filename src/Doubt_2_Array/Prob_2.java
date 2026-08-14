import java.util.*;
// Deepak has a limited amount of money that he can spend on his girlfriend. So he decides to buy two roses for her. 
// Since roses are of varying sizes, their prices are different. Deepak wishes to completely spend that fixed amount of 
// money on buying roses for her.
// As he wishes to spend all the money, he should choose a pair of roses whose prices when summed up are equal to the money that he has.
// Help Deepak choose such a pair of roses for his girlfriend.

// NOTE: If there are multiple solutions print the solution that minimizes the difference between the prices i and j. After each test case, 
// you must print a blank line.


// Input Format
// The first line indicates the number of test cases T.
// Then, in the next line, the number of available roses, N is given.
// The next line will have N integers, representing the price of each rose, a rose that costs less than 1000001.
// Then there is another line with an integer M, representing how much money Deepak has.
// There is a blank line after each test case.


// Constraints
// 1≤ T ≤100
// 2 ≤ N ≤ 10000
// Price[i]<1000001


// Output Format
// For each test case, you must print the message: ‘Deepak should buy roses whose prices are i and j.’, where i and j are 
// the prices of the roses whose sum is equal do M and i ≤ j. You can consider that it is always possible to find a solution.
//  If there are multiple solutions print the solution that minimizes the difference between the prices i and j.


// Sample Input
// 2
// 2
// 40 40
// 80

// 5
// 10 2 6 8 4
// 10
// Sample Output
// Deepak should buy roses whose prices are 40 and 40.
// Deepak should buy roses whose prices are 4 and 6.
// Explanation
// Find two such kinds of price of roses which has sum up to equal to Deepak's Money.
public class Prob_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int[] price=new int[n];
            for (int i = 0; i < price.length; i++) {
                price[i]=sc.nextInt();
            }

            int M=sc.nextInt();
            buyRose(price, M);
        }
    }
    public static void buyRose(int[] price,int money){
        int p1=0;
        int p2=0;
        int diff=Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            for (int j = i; j < price.length; j++) {
                if(price[i]+price[j]==money){
                    int newDiff=Math.abs(price[i]-price[j]);
                    if(newDiff<diff){
                        diff=newDiff;
                        p1=Math.min(price[i],price[j]);
                        p2=Math.max(price[i],price[j]);
                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are "
                + p1 + " and " + p2 + ".");
    }
}

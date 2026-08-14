import java.util.*;
// Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

// A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is 
// nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].


// Input Format
// First line contains integer t which is number of test case.
// For each test case, it contains an integer n which is the size of array and next line contains n space separated integers 
// denoting the elements of the array.


// Constraints
// 1<=t<=100
// 1<=n<=1000
// |Ai| <= 10000


// Output Format
// Print the maximum circular sum for each testcase in a new line.


// Sample Input
// 1
// 7
// 8 -8 9 -9 10 -11 12
// Sample Output
// 22
// Explanation
// Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)
public class Prob_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            int a=linearMaxSub(arr);
            int b=circularMaxSub(arr);
            int ans=Math.max(a, b);
            System.out.println(ans);
        }
    }
    public static int circularMaxSub(int[] arr){
        int totsum=0;
        for (int i = 0; i < arr.length; i++) {
            totsum+=arr[i];
            arr[i]=arr[i]*-1;
        }
        int sum=linearMaxSub(arr);
        int ans=totsum+sum;

        return ans;
    }
    public static int linearMaxSub(int[] arr){
        int ans=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            ans=Math.max(sum, ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}

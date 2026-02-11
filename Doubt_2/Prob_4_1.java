import java.util.*;
// You are given an array of integers that represents a permutation of numbers. Your task is to find the next lexicographical 
// permutation of the array. If such a permutation does not exist (i.e., the array is sorted in descending order), rearrange the array 
// to its smallest permutation (sorted in ascending order).


// Input Format
// A single integer n representing the size of the array.
// An array of n integers, nums, representing the permutation.

// Constraints
// 1 ≤ n ≤ 105
// 1 ≤ nums[i] ≤ 105
// All elements in the array are not necessarily distinct.

// Output Format
// Output the array after transforming it into its next lexicographical permutation. If no such permutation exists, output the array 
// sorted in ascending order.


// Sample Input
// 3
// 1 2 3
// Sample Output
// 1 3 2
// Explanation
// The next permutation of [1, 2, 3] in lexicographical order is [1, 3, 2].
public class Prob_4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] permArr=new int[n];
        for (int i = 0; i < n; i++) {
            permArr[i]=sc.nextInt();
        }
        nextGreater(permArr);
    }
    public static void nextGreater(int[] arr){
        int l=arr.length;
        int p=0;
        for (int i = l-2; i < 0; i--) {
            if(arr[i-1]>arr[i]){
                p=i;
                break;
            }
        }
        System.out.println(p);
    }
    public static void arrrev(int[] arr,int i,int j){
        for (int k = i; k < j; k++) {
            int temp=arr[k];
            arr[k+1]=arr[k];
            arr[k]=temp;
        }
    }
}

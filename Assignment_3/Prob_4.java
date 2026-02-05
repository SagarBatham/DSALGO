
import java.util.*;
// Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

// Input Format
// The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.
// Constraints
// Length of the arrays should be between 1 and 1000.
// Output Format
// Print all the pairs of numbers which sum to target. Print each pair in increasing order.
// Sample Input
// 5
// 1
// 3
// 4
// 2
// 5
// 5
// Sample Output
// 1 and 4
// 2 and 3
// Explanation
// Find any pair of elements in the array which has sum equal to target element and print them.
public class Prob_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Elements: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a Target: ");
        int target = sc.nextInt();
        targetTwoSum(arr, target);
    }

    public static void targetTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int a = Math.min(arr[i], arr[j]);
                    int b = Math.max(arr[i], arr[j]);
                    System.out.println(a + " and " + b);
                }
            }
        }
    }
}

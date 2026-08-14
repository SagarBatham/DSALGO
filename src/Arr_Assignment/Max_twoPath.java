
import java.util.Scanner;

// You are provided two sorted arrays. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of 
// the two arrays. You can switch from one array to another array only at common elements.
// link
// Input Format
// First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays
//  and next two lines contains n and m space separated integers respectively.
// Constraints
// 1<=t<=100 1<=n,m, nums1[i], num2[i]<=100000
// Output Format
// Print the maximum path Sum.
// Sample Input
// 2
// 8 8
// 2 3 7 10 12 15 30 34
// 1 5 7 8 10 15 16 19
// 5 4
// 2 4 5 8 10
// 4 6 8 9
// Sample Output
// 122
// 30
// Explanation
// Test Case1 Explanation :- 122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34
public class Max_twoPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] path1 = new int[n];
            int[] path2 = new int[m];

            for (int i = 0; i < path1.length; i++) {
                path1[i] = sc.nextInt();
            }

            for (int i = 0; i < path2.length; i++) {
                path2[i] = sc.nextInt();
            }

            int p1 = 0;
            int p2 = 0;
            int sum1 = 0;
            int sum2 = 0;
            int ans = 0;

            while (p1 < path1.length && p2 < path2.length) {
                if (path1[p1] < path2[p2]) {
                    sum1 += path1[p1];
                    p1++;
                } else if (path1[p1] > path2[p2]) {
                    sum2 += path2[p2];
                    p2++;
                } else {
                    ans+= Math.max(sum1, sum2) + path1[p1];
                    sum1 = 0;
                    sum2 = 0;
                    p1++;
                    p2++;
                }
            }
            while (p1 < path1.length) {
                sum1 += path1[p1];
                p1++;
            }

            while (p2 < path2.length) {
                sum2 += path2[p2];
                p2++;
            }
            ans += Math.max(sum1, sum2);

            System.out.println(ans);
        }
    }
}

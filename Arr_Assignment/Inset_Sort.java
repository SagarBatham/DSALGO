// Given an array A of size N , write a function that implements insertion sort on the array. Print the elements of sorted array.


// Input Format
// First line contains a single integer N denoting the size of the array. Next line contains N space seperated integers where ith integer is 
// the ith element of the array.


// Constraints
// 1 <= N <= 1000
// |Ai| <= 1000000


// Output Format
// Output N space seperated integers of the sorted array in a single line.


// Sample Input
// 4
// 3 4 2 1
// Sample Output
// 1 2 3 4
// Explanation
// For each test case, write insertion sort to sort the array.

import java.util.Scanner;

public class Inset_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int ele=arr[i];
            int j=i-1;

            while(j>=0 && ele<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=ele;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

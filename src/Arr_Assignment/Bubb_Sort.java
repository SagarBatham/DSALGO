
import java.util.Scanner;

// Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that bubble sorts the array. Print the
//  elements of sorted array.

// 1.It reads a number N.
// 2.Take Another N numbers as input and store them in an Array.
// 3.Bubble sort the array and print the Array.


// Input Format

// Constraints
// N cannot be Negative. Range of Numbers can be between -1000000000 to 100000000.


// Output Format

// Sample Input
// 4
// 2
// -18
// 45
// 30
// Sample Output
// -18
// 2
// 30
// 45
// Explanation
// For each test case write bubble sorting program to sort the elements of the array.
public class Bubb_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    long temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}

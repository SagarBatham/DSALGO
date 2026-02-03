
import java.util.Scanner;

// Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which inverses the array. Print the values of inverted array


// Input Format
// Enter a number N and take N more inputs


// Constraints
// None


// Output Format
// Display the values of the inverted array in a space separated manner


// Sample Input
// 5
// 0 2 4 1 3
// Sample Output
// 0 3 1 4 2
public class Prob_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        inverArr(arr);
    }
    public static void inverArr(int[] arr) {
        int n=arr.length;
        int[] newarr=new int[n];

        for (int i = 0; i < arr.length-1; i++) {
            int rem=arr[i];
            newarr[rem]=i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newarr[i]+ " ");
        }
    }
}

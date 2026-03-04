import java.util.*;
// Take as input N, the size of an array. Take N more inputs and store that in an array. Take another number’s input as M. Write a function which returns the index on which M is found in an array, in case M is not found -1 is returned. Print the value returned.

// It reads a number N.
// 2.Take Another N numbers as an input and store them in an Array.
// Take another number M as an input.
// If M is found in the Array the index of M is returned else -1 is returned and print the value returned.

// Input Format

// Constraints
// N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000. M can be between -1000000000 to 1000000000.


// Output Format

// Sample Input
// 5
// 2
// 4
// 6
// 9
// 17
// 17
// Sample Output
// 4
public class Que_3 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            return;
        }
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(targetSearch(arr,target));
    }
    public static int targetSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

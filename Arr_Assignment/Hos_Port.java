
import java.util.Scanner;


// In a busy hospital emergency room, patients are triaged based on their severity levels to prioritize treatment. Each patient is assigned a 
// severity code:
// ● 0: Non-urgent cases
// ● 1: Moderately urgent cases
// ● 2: Critical cases

// The hospital's system must efficiently sort these severity levels to ensure that critical cases are attended to first, followed by 
// moderately urgent, and finally, non-urgent cases. You are tasked with writing a function that takes a list of integers representing patient 
// severity levels and sorts it in ascending order. The goal is to ensure patients are categorized by their severity efficiently.


// Input Format
// The first line contains N, which is the size of the array. The following N lines contain either 0, or 1, or 2.


// Constraints
// 1 <= N <= 10^6
// Each input element x, such that x ∈ { 0, 1, 2 }.


// Output Format
// Output the sorted array with each element separated by a newline.


// Sample Input
// 5
// 0
// 1
// 2
// 1
// 2
// Sample Output
// 0
// 1
// 1
// 2
// 2
public class Hos_Port {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int i=0;
        int j=0;
        int k=arr.length-1;

        while(j<=k){
            if(arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else if(arr[j]==2){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                k--;
            }else{
                j++;
            }
        }
        
        System.out.println();
        for (int p = 0; p < arr.length; p++) {
            System.out.println(arr[p]);
        }

    }
}

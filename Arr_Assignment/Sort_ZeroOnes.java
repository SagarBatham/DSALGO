
import java.util.Scanner;

// Sort just 0 and 1


// Input Format
// A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space


// Constraints
// N will not exceed 10^7


// Output Format
// Sorted Sequence


// Sample Input
// 7
// 1 0 0 1 1 0 1
// Sample Output
// 0 0 0 1 1 1 1
public class Sort_ZeroOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                arr[i]=0;
                i++;
            }else if(arr[i]==1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}

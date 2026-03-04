// 215. Kth Largest Element in an Array
import java.util.*;
public class Prob_215 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4}; 
        int k = 2;
        System.out.println(kthLargest(nums, k));
    }
    public static int kthLargest(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if(pq.size()<k){
                pq.add(arr[i]);
            }else if(pq.peek()<arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }
}

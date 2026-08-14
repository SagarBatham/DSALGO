// 977. Squares of a Sorted Array
public class Prob_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] arr=sortedSquares(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int start=0;
        int[] arr=new int[nums.length];
        int end=nums.length-1;
        int ptr=nums.length-1;
        while(start<=end){
            int num1=nums[start];
            int num2=nums[end];
            int n1=num1*num1;
            int n2=num2*num2;
            if(n1>n2){
                arr[ptr]=n1;
                ptr--;
                start++;
            }else{
                arr[ptr]=n2;
                ptr--;
                end--;
            }
        
        }
         return arr;
    }
}

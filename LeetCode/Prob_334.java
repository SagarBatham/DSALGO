// 334. Increasing Triplet Subsequence

public class Prob_334{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(increasingTriplet(arr));
    }
    public static boolean increasingTriplet(int[] nums) {
       int first=Integer.MAX_VALUE;
       int second=Integer.MAX_VALUE;
       int third=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<=first){
            first=nums[i];
        }else if(nums[i]<=second){
            second=nums[i];
        }else{
            third=nums[i];
            return true;
        }
       }
       return false;
    }
}
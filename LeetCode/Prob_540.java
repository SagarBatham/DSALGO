// 540. Single Element in a Sorted Array
public class Prob_540 {
    public static void main(String[] args) {
        
    }
    public static int singleNonDuplicate(int[] nums) {
        int ans=0;
        if(nums.length==1){
            return nums[0];
        }else if(nums[0]!=nums[1]){
            return nums[0];
        }else if(nums[nums.length-1]!=nums[nums.length-1]){
            return nums[nums.length-1];
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid + 1] && nums[mid - 1] != nums[mid]) {
                return nums[mid];
            } else if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }else{
                if(nums[mid]==nums[mid-1]){
                    low=mid+1;
                }else{
                    high=mid-1;
                } 
            }
        }
        return -1;
    }

}

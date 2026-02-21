// 153. Find Minimum in Rotated Sorted Array
public class Prob_153 {
    public static void main(String[] args) {
        
    }
    public static int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        int ans=Integer.MAX_VALUE;;
        if(nums[0]<nums[high]){
            return nums[0];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid!=0&&nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            else if(nums[mid+1]<nums[mid]&&mid!=nums.length-1){
                return nums[mid+1];
            }else if(nums[low]<=nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
         return ans;
    }
}

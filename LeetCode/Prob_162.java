// 162. Find Peak Element
public class Prob_162 {
    public static void main(String[] args) {
        
    }
    public static int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if(nums.length==1){
            return 0;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==0){
                if(nums[mid]>nums[mid+1]){
                    return 0;
                }else{
                    return 1;
                }
            }
            if(mid==nums.length-1){
                if(nums[mid]<nums[mid-1]){
                    return mid-1;
                }else{
                    return mid;
                }
            }
            
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
         return -1;
    }
}

// 33. Search in Rotated Sorted Array
public class Prob_33{
    public static void main(String[] args) {
        
    }
    public static int search(int[] nums, int target) {
        int low = 0;
        int end = nums.length - 1;

        while (low <= end) {
            int mid = low + (end - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (nums[low] <= nums[mid]) {

                if (target >= nums[low] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    low = mid + 1;
                }

            } 
            // Right half sorted
            else {

                if (target > nums[mid] && target <= nums[end]) {
                    low = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
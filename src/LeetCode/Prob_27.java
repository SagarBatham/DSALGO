// 27. Remove Element
public class Prob_27 {
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        int k=3;
        System.out.println(removeElement(arr, k));
    }
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
     

    }
}

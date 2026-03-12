// 287. Find the Duplicate Number
public class Prob_287 {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(dupl(nums));
    }

    public static int dupl(int[] nums){
        int ans=0;

        for (int i = 0; i < nums.length; i++) {
            int ele=nums[i];
            ele=Math.abs(ele);

            if(nums[ele]>0){
                nums[ele]=-nums[ele];
            }else{
                ans=ele;
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i]=Math.abs(nums[i]);
        }

        return ans;
    }
}

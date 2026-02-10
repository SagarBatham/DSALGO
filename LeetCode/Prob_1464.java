// 1464. Maximum Product of Two Elements in an Array
public class Prob_1464 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int max=-1;
        int smax=-1;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                smax=max;
                max=nums[i];
            }else if(nums[i]>smax){
                smax=nums[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        int a=max-1;
        int b=smax-1;
        System.out.println(a*b);
    }
}

public class Prob_53 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArr(nums));
    }
    public static int maxSubArr(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+nums[i];
            ans=Math.max(sum, ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}

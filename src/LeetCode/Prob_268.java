public class Prob_268 {
    public static void main(String[] args) {
        int[] arr={1,0,3};
        int a=missingNumber(arr);
        System.out.println(a);
    }
    public static int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        int numSum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int ans=numSum-sum;
        return ans;
    }
}

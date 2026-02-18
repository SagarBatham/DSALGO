public class Prob_1800 {
    public static void main(String[] args) {
        int[] arr={10,20,30,5,10,50};
        System.out.println(maxAscendingSum(arr));
    }
    public static int maxAscendingSum(int[] nums) {
        int currsum=0;
        int finalsum=0;
        int n=nums[0];
        for(int i=0;i<nums.length;i++){
            if(n<nums[i]){
                currsum+=nums[i];
            }else{
                currsum=nums[i];
            }
            n=nums[i];
            finalsum=Math.max(finalsum,currsum);
        }
        return finalsum;
    }
}

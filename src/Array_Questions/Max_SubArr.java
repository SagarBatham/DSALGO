public class Max_SubArr {
    public static void main(String[] args) {
        int[] arr={2,-3,5,-1,4};
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum=0;
            for (int j = i; j < arr.length; j++) {
                currSum+=arr[j];
                ans=Math.max(ans, currSum);
            }
        }
        System.out.println(ans);
    }
}

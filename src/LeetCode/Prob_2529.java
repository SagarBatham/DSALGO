// 2529. Maximum Count of Positive Integer and Negative Integer
public class Prob_2529 {
    public static void main(String[] args) {
        
    }
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;

        for (int num : nums) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
        }

        return Math.max(pos, neg);
    }
}

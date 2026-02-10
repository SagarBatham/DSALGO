// 4. Median of Two Sorted Arrays
public class Prob_4 {
    public static void main(String[] args) {
        int[] num1={1,2};
        int[] num2={3,4};
        int n=num1.length+num2.length;
        int[] ans=new int[n];
        for (int i = 0; i < n; i++) {
            if(num1[i]<num2[i]){
                ans[i]=num1[i];
            }else{
                ans[i]=num2[i];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

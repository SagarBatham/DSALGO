// 4. Median of Two Sorted Arrays
public class Prob_4 {
    public static void main(String[] args) {
        int[] num1={1,2};
        int[] num2={3,4};
        int n1=num1.length;
        int n2=num2.length;
        int[] ans=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(num1[i]<num2[j]){
                ans[k]=num1[i];
                k++;
                i++;
            }else{
                ans[k]=num2[j];
                k++;
                j++;
            }
        }

            while(i<n1){
                ans[k++]=num1[i++];
            }

            while(j<n2){
                ans[k++]=num2[j++];
            }
        


        for (int l = 0; l < ans.length; l++) {
            System.out.println(ans[l]);
        }
    }
}

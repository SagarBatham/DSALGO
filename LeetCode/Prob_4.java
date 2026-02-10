// 4. Median of Two Sorted Arrays
public class Prob_4 {
    public static void main(String[] args) {
        int[] num1={1,2,3};
        int[] num2={4,5,6};
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
                ans[k]=num1[i];
                k++;
                i++;
            }

            while(j<n2){
                ans[k]=num2[j];
                k++;
                j++;
            }
        
        
        double answer=0;
        if(ans.length%2==0){
            int mid=ans.length/2;
            answer=(double)(ans[mid]+ans[mid-1])/2;
            System.out.println(answer);
        }else{
            int mid=ans.length/2+1;
            answer=mid;
            System.out.println(answer);
        }
    }
}

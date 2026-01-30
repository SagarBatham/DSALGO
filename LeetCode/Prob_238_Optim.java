public class Prob_238_Optim {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8};
        int[] result=arrayItself(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] arrayItself(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int[] leftmul=new int[n];
        leftmul[0]=1;
        for (int i = 1; i < n; i++) {
            leftmul[i]=arr[i-1]*leftmul[i-1];
        }
        int[] rightmul=new int[n];
        rightmul[n-1]=1;
        for (int i = n-2; i >= 0; i--) {
            rightmul[i]=arr[i+1]*rightmul[i+1];
        }
        for (int i = 0; i < n; i++) {
            ans[i]=leftmul[i]*rightmul[i];
        }
        return ans;
     }
     
}

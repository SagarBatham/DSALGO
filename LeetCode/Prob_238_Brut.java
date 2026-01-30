public class Prob_238_Brut{
    public static void main(String[] args) {
        int[] arr={-1,1,0,-3,3};
        int[] ans=arrayItself(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] arrayItself(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        for (int i = 0; i < n; i++) {
            int leftmul=1;
         for (int j = 0; j <= i-1; j++) {
             leftmul*=arr[j];
         }
          int rightmul=1;
         for (int k = i+1; k <n; k++) {
             rightmul*=arr[k];
         }
         ans[i]=leftmul*rightmul;
     }
     return ans;
    }
}

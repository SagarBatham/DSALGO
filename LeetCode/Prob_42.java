public class Prob_42 {
    public static void main(String[] args) {
        int[] arr={2,7,2,3,1,5,3,6};
    }
       public static int trappingWater(int[] arr){
        int n=arr.length;
        int[] right_arr=new int[n];
        int[] left_arr=new int[n];
        left_arr[0]=arr[0];
        for (int i = 1; i < n; i++) {
            left_arr[i]=Math.max(arr[i], left_arr[i-1]);
        }
        right_arr[n-1]=arr[n-1];
        for (int i = n-2; i>=0; i--) {
            right_arr[i]=Math.max(arr[i], right_arr[i+1]);
        }
        
        System.out.println();
        int trapwater=0;
        for (int i = 0; i < n; i++) {
            trapwater+=Math.min(left_arr[i], right_arr[i])-arr[i];
       }
       return trapwater;
       }
    }   


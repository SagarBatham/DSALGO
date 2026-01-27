public class Pro_189 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        // rotated_Arr(arr, k);
        rotated_Arr_Optimized(arr, k);
    }
    public static void rotated_Arr(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        while(k>0){
            int last=arr[n-1];
            for (int i = n-2; i >= 0; i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=last;
        k--;
        }
        for (int idx = 0; idx < arr.length; idx++) {
           System.out.print(arr[idx]+" "); 
        }
        System.out.println();
    }
    public static void rotated_Arr_Optimized(int[] arr,int k){ //Reversal Algorithm
        int n=arr.length;
        k=k%n;
        for (int i = k; i < n-1; i++) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for (int idx = 0; idx < arr.length; idx++) {
           System.out.print(arr[idx]+" "); 
            
        }
    }
}

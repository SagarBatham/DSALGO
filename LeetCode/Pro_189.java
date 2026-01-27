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
        displayArr(arr);
        swapArr(arr, n-k, n-1);
        displayArr(arr);
        swapArr(arr, 0, n-k-1);
        displayArr(arr);
        swapArr(arr, 0, n-1);
        displayArr(arr);
    }
    public static void swapArr(int[] arr,int in,int fin){
        int i=in;
        int j=fin;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void displayArr(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

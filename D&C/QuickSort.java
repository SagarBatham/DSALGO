public class QuickSort {
    public static void main(String[] args) {
        int[] arr={2,7,4,8,2,9,5};
        quick_sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quick_sort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }

        int p=partition(arr,start, end);
        quick_sort(arr, start, p-1);
        quick_sort(arr, p+1, end);
    }

    public static int partition(int[] arr,int start,int end){
        int piv=arr[end];
        int i=start-1;
        for (int j = start; j < end; j++) {
            if(arr[j]<=piv){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;

        return i+1;
    }
}

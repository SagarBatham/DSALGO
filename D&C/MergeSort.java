public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,2,6,2,6,7};
        MergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void MergeSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }

        int mid=start+(end-start)/2;

        MergeSort(arr, start, mid);
        MergeSort(arr, mid+1, end);
        MergeArr(arr, start, mid, end);
    }

    public static void MergeArr(int[] arr,int start,int mid,int end){
        int[] result=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                result[k++]=arr[i++];
            }else{
                result[k++]=arr[j++];
            }
        }

        while(i<=mid){
            result[k++]=arr[i++];
        }

        while(j<=end){
            result[k++]=arr[j++];
        }

        for(int m = 0; m < result.length; m++) {
            arr[m+start]=result[m];
        }
    }
}

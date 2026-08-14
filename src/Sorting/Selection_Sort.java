public class Selection_Sort extends Display_Arr {
    public static void main(String[] args) {
        int[] arr={5,3,7,9,8};
        sort(arr);
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIdx=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
                int temp=arr[i];
                arr[i]=arr[minIdx];
                arr[minIdx]=temp;
                }
            displayArr(arr);
        }
    }

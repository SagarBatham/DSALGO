public class Bubble_Sort extends Display_Arr {
    public static void main(String[] args) {
        int[] arr={5,3,7,9,8};
        sort(arr);
        displayArr(arr);
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        displayArr(arr);
    }
}

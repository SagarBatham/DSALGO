public class Insertion_Sort extends Display_Arr{
    public static void main(String[] args) {
        int[] arr={5,3,7,9,8};
        sort(arr);
    }
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int item=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=item;
        }
        displayArr(arr);
   }
}

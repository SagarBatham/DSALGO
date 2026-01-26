public class SwapArr {
    public static void main(String[] args) {
        int[] arr={2,4,6,3,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        swapEle(arr, 2, 3);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swapEle(int[] arr,int init,int fin){
        int temp=arr[init];
        arr[init]=arr[fin];
        arr[fin]=temp;
    }
}

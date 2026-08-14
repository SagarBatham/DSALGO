public class MaxEle {
    public static void main(String[] args) {
        int[] arr={2,5,3,7,19,9,2,10};
        System.out.println(maxEle(arr));
    }
    public static int maxEle(int[] arr){
        int temp=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
}

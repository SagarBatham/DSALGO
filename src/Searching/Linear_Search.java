public class Linear_Search {
    public static void main(String[] args) {
        int[] arr={3,5,1,7,3,8};
        int ele=7;
        int a=search_linear(arr,ele);
        System.out.println(a);
    }
    public static int search_linear(int[]arr,int ele){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele){
                System.out.println("Element is found at Index "+i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
}

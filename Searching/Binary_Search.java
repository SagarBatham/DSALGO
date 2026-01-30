public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,8,11,25,67,446};
        int item=67;
        System.out.println(binary_search(arr, item));
    }
    public static int binary_search(int[]arr,int item){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<end){
            if(arr[mid]==item){
                return mid;
            }else if(arr[mid]>item){
                mid=mid-1;
            }else{
                mid=mid+1;
            }
        }
        return -1;  
    }
}

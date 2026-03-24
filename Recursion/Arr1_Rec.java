public class Arr1_Rec {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,5,6,5,15,5};
        System.out.println(rec_Search(arr, 16, 0));
    }
    public static int rec_Search(int[] arr, int item,int i){

        if(arr[i]==item){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        
        return rec_Search(arr, item, i+1);
    }
}

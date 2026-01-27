public class RevRangeArr {
    public static void main(String[] args) {
        int[] arr={1,5,3,7,4,9};
        // revArr(arr);
        revArr2(arr,2,4);
    }
    public static void revArr(int[] arr){
        int n=arr.length-1;
        for (int i = 0; i <arr.length/2; i++,n--) {
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void revArr2(int[] arr,int in,int fin){
        while(in<fin){
            int temp=arr[in];
            arr[in]=arr[fin];
            arr[fin]=temp;
            in++;
            fin--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        } 
    }
}

public class RevArr {
    public static void main(String[] args) {
        int[] arr={1,5,3,7,4,9};
        // revArr(arr);
        revArr2(arr);
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
    public static void revArr2(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}

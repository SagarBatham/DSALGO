public class Mat_2DPath {
    public static void main(String[] args) {
        int[][] path=new int[3][3];
        findPath(path, 0, 0, "");
        
    }
    public static void findPath(int[][] arr,int right,int bottom,String ans) {
        // if(right==arr.length-1 && bottom==arr[0].length-1){
        //     System.out.println(ans);
        //     return;
        // }


        // if(right<arr.length-1){
        //     findPath(arr, right+1, bottom, ans+'H');
        // }

        // if(bottom<arr[0].length-1){
        // findPath(arr, right, bottom+1, ans+'V');
        // }
        

        if (right == arr.length-1 && bottom == arr[0].length-1) {
            System.out.println(ans);
            return;
        }
        if (right >= arr.length || bottom >= arr[0].length) {
            return;
        }

        findPath(arr, right + 1, bottom, ans + 'H');
        findPath(arr, right, bottom + 1, ans + 'V');
    }
}

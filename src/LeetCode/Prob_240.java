public class Prob_240 {
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24}};
        int target=10;
        System.out.println(searchMatrix(arr, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            if(target==matrix[row][col]){
                return true;
            }else if(target>matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}

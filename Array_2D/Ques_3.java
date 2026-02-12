public class Ques_3 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        int row=0;
        int col=0;
        int rowmax=arr.length-1;
        int colmax=arr[0].length-1;
        while(row<arr.length&&col<arr[0].length){
            for (int i = col; i <= colmax; i++) {
            System.out.print(arr[row][i]+" ");
        }
        row++;
        for (int i = row; i<=rowmax; i++) {
            System.out.print(arr[i][colmax]+" ");
        }
        colmax--;
        for (int i =colmax ; i >= col; i--) {
            System.out.print(arr[rowmax][i]+" ");
        }
        rowmax--;
        for (int i = rowmax; i >= 0; i--) {
            System.out.print(arr[i][col]+" ");
        }
        col++;
        }
        
    }
}

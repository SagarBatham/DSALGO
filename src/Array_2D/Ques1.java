package Array_2D;

import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int col=0;
        for (int row = 0; row < arr.length; row++) {
            System.out.print(arr[row][col]+" ");
        }
        col++;
        for (int row = arr.length-1; row>= 0; row--) {
            System.out.print(arr[row][col]+" ");
        }
        col++;
        for (int row = 0; row < arr.length; row++) {
            System.out.print(arr[row][col]+" ");
        }
        col++;
        for (int row = arr.length-1; row >= 0; row--) {
            System.out.print(arr[row][col]+" ");
        }
    }
}

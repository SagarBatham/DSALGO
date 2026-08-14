package Array_Basics;

public class Intro {
    public static void main(String[] args) {
        int [] arr=new int[5];
        // System.out.println(arr);
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]");
        }
    }
}

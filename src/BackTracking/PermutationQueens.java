public class PermutationQueens {
    public static void main(String[] args) {
        int NoOfPlace=4;
        boolean[] arr=new boolean[NoOfPlace];
        generatePermutation(arr, 2, 0, "");
    }

    public static void generatePermutation(boolean[] arr,int queen,int place,String ans) {
        if(queen==place){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==false){
                arr[i]=true;
                generatePermutation(arr, queen, place+1, ans+"b"+i+"q"+place);
                arr[i]=false;
            }
        }
    }
}

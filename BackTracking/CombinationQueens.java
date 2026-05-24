public class CombinationQueens {
    public static void main(String[] args) {
        int NoOfPlace=4;
        boolean[] arr=new boolean[NoOfPlace];
        generateCombination(arr, 2, 0, "",0);
    }

    public static void generateCombination(boolean[] arr,int queen,int place,String ans,int idx) {
        if(place==queen){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if(arr[i]==false){
                arr[i]=true;
                generateCombination(arr, queen, place+1, ans+"b"+i+"q"+place+" ",i+1);
                arr[i]=false;
            }
        }
    }
}

public class Normal_HeadTail {
    public static void main(String[] args) {
        printHT(3, "");
    }

    public static void printHT(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }


        printHT(n-1, ans+'H');
        printHT(n-1, ans+'T');
    }
}

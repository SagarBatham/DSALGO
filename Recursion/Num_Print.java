public class Num_Print {
    public static void main(String[] args) {
        desNum(5);
    }

    public static void desNum(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        desNum(n-1);
    }
}

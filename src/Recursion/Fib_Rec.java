public class Fib_Rec {
    public static void main(String[] args) {
        int n=4;
        System.out.println(printNthFib(n));
    }
    public static int printNthFib(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }

        return printNthFib(n-1)+printNthFib(n-2);
    }
}

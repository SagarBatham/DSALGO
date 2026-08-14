public class FibPatt {
    public static void main(String[] args) {
        int n=4;
        int i=1;
        int num=1;
        int a=0;
        int b=1;
        while(i<=n){
            int j=1;
            while(j<=num){
                System.out.print(a+" ");
                int c=a+b;
                a=b;
                b=c;
                j++;
            }
            num++;
            i++;
            System.out.println();
        }
    }
}

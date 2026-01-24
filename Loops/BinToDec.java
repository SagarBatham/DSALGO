public class BinToDec {
    public static void main(String[] args) {
        int n=1111;
        int sum=0;
        int mul=1;
        while(n>0){
            int rem=n%10;
            sum=sum+rem*mul;
            mul=mul*2;
            n=n/10;
        }
        System.out.println(sum);
    }
}

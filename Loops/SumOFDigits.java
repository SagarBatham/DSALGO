public class SumOFDigits {
    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        while(num!=0){
            int lst=num%10;
            sum+=lst;
            num=num/10;
        }
        System.out.println(sum);
    }
}

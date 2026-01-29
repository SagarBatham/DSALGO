//Print reverse
public class Prob_3 {
    public static void main(String[] args) {
        int n=123456789;
        int rev=0;
        while(n>0){
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println(rev);
    }
}

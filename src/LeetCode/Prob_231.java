//231. Power of Two
public class Prob_231 {
    public static void main(String[] args) {
        int n=16;
        System.out.println(PowerOfTwo(n));
        
    }
    public static boolean  PowerOfTwo(int n) {
        while(n>1){
            if (n%2!=0) {
                System.out.println(n);
                return false;
            }
            n=n/2;
        }
        return true;
    }
}

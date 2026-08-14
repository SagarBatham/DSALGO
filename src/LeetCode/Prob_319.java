// 319. Bulb Switcher
public class Prob_319 {
    public static void main(String[] args) {
        int a=bulbSwitch(15);
        System.out.println(a);
    }
    public static int bulbSwitch(int n) {
        int count=0;
        int i=1;
        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }
}

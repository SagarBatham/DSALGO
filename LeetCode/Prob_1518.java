// 1518. Water Bottles
public class Prob_1518 {
    public static void main(String[] args) {
        int totalBottles=9;
        int bottleExchange=3;
        System.out.println(maxBottles(totalBottles, bottleExchange));
    }
    public static int maxBottles(int totalBottles,int bottleExchange){
        int ans=totalBottles;
        while(totalBottles>=bottleExchange){
            int newBottles=totalBottles/bottleExchange;

            int remBottles=totalBottles%bottleExchange;

            ans=ans+newBottles;

            totalBottles=remBottles+newBottles;
        }

        return ans;
    }
}

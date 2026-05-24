
import java.util.ArrayList;

public class Coin_Calc {
    public static void main(String[] args) {
        int[] coins={2,1,3,5};
        ArrayList<Integer> ll=new ArrayList<>();
        findCoins(coins, 4, ll, 0);
        System.out.println(findCoins(coins, 4, ll, 0));
    }

    public static ArrayList<ArrayList<Integer>> findCoins(int[] coins,int amount,ArrayList<Integer> ll,int idx){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(amount==0){
            ans.add(new ArrayList<>(ll));
            System.out.println(ll);
        }
        for (int i = idx; i < coins.length; i++) {
            if(amount>=coins[i]){
                ll.add(coins[i]);
                ans.addAll(findCoins(coins, amount-coins[i], ll, i));
                ll.remove(ll.size()-1);
            }
        }
        
        return  ans;
    }
}


import java.util.*;

public class Prob_128{
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};

        HashMap<Integer,Boolean> hm=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], false);
        }

        for(int key: hm.keySet()){
            if(hm.containsKey(key-1)==false){
                hm.put(key, true);
            }
        }
        int ans=0;
        for(int key: hm.keySet()){
            int k=1;
            if(hm.get(key)==true){
                while(hm.containsKey(key+k)==true){
                    k++;
                }
            }
            ans=Math.max(k, ans);
        }

        
        System.out.println(ans);
    }
}
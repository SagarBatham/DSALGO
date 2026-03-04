// 2089. Find Target Indices After Sorting Array

import java.util.ArrayList;
import java.util.List;

public class Prob_2089 {
    public static void main(String[] args) {
        
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        int num=0;
        int tcount=0;
        for(int ele:nums){
            if(ele==target){
                tcount++;
            }else if(ele<target){
                num++;
            }
        }
        List<Integer> ans=new ArrayList<>();

        while(tcount>0){
            ans.add(num);
            num++;
            tcount--;
        }

        return ans;
    }
}

// 881. Boats to Save People

import java.util.Arrays;

public class Prob_881 {
    public static void main(String[] args) {
        
    }
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int start=0;
        int end=people.length-1;
    int count=0;
        while(start<=end){
            if(people[start]+people[end]<=limit){
                count++;
                start++;
                end--;
            }else if(people[end]<=limit){
                count++;
                end--;    
            }
    }

    return count;
}
}

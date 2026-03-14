
import java.util.*;

// 1046. Last Stone Weight
public class Prob_1046 {
    public static void main(String[] args) {
        int[] arr={2,7,4,1,8,1};
        System.out.println(stoneBeat(arr));
    }

    public static int stoneBeat(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int e:arr){
            pq.add(e);
        }

        while(pq.size()>1){
            int max=pq.remove();
            int smax=pq.remove();

            int newStone=max-smax;

            if(newStone!=0){
                pq.add(newStone);
            }
        }

        if(pq.size()==0){
            return 0;
        }else{
            return pq.remove();
        }
    }
}

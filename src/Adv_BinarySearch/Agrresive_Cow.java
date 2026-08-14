package Adv_BinarySearch;

import java.util.*;

// You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes 
// the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum 
// possible.

// Examples :

// Input: stalls[] = [1, 2, 4, 8, 9], k = 3
// Output: 3
// Explanation: The first cow can be placed at stalls[0], 
// the second cow can be placed at stalls[2] and 
// the third cow can be placed at stalls[3]. 
// The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.
public class Agrresive_Cow {
    public static void main(String[] args) {
        int[] stall={10, 1, 2, 7, 5};
        int k=3;
        Arrays.sort(stall);
        int n=cowSeperation(stall, k);
        System.out.println(n);
    }
    public static int cowSeperation(int[] stall,int k){
        int low=0;
        int high=stall.length-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(ispossible(stall,k,mid)){
                ans=mid;
                low=mid+1;
    
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int[] stall,int noC,int mid){
        int cownum=1;
        int pos=stall[0];
        for (int i = 1; i < stall.length; i++) {
            if(stall[i]-pos>=mid){
                pos=stall[i];
                cownum++;
            }
            if(cownum==noC){
            return true;
        }
        }

        return false;
    }
}

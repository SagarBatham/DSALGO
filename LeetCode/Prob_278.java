// 278. First Bad Version
public class Prob_278 {
    public static void main(String[] args) {
        
    }
    public static int firstBadversion(int n) {
        int lo=1;
        int hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isBadVersion(mid)==true){
                int ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}

public class nthkNum {
    public static void main(String[] args) {
        int N=87;
        int k=3;
        System.out.println(nthRoot(N, k));
    }
    public static int nthRoot(int n,int k) {
        int start=1;
        int end=n;
        int ans=0;
        while(start<=end){
            int mid=(start+end)/2;
            if((Math.pow(mid, k))<=n){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}

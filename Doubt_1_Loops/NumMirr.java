public class NumMirr {
    public static void main(String[] args) {
        int n=7;
        int rows=1;
        int star=1;
        int outspace=n-1;
        int inSpace=-1;
        int num=1;
        while(rows<=n){
            int i=1;
            while(i<=outspace){
                System.out.print("  ");
                i++;
            }
            int j=1;
            int val=num;
            while(j<=star){
                System.out.print(val+" ");
                val--;
                j++;
            }
            int k=1;
            while(k<=inSpace){
                System.out.print("  ");
                k++;
            }
            int l=1;
            if(rows==1||rows==n){
                l=2;
            }
            val++;
            val=1;
            while(l<=star){
                System.out.print(val+" ");
                val++;
                l++;
            }
            if(rows<n/2+1){
                star++;
                outspace-=2;
                inSpace+=2;
                num++;
            }else{
                star--;
                outspace+=2;
                inSpace-=2;
                num--;
            }
            rows++;
            System.out.println();
        }
    }
}

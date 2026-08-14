public class Loop_19 {
    public static void main(String[] args) {
        int n=7;
        int i=1;
        int exSpace=n/2;
        int inSpace=-1;
        int star=1;
        while(i<=n){
            int j=1;
            while(j<=exSpace){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            int l=1;
            while(l<=inSpace){
                System.out.print("  ");
                l++;
            }
            int m=1;
            if(i==1||i==n){
                m=2;
            }
            while(m<=star){
                System.out.print("* ");
                m++;
            }
            if(i<=n/2){
                inSpace+=2;
                exSpace--;
            }else{
                inSpace-=2;
                exSpace++;
            }
            i++;
            System.out.println("");
        }
    }
}

public class HollowRh {
    public static void main(String[] args) {
        int n=5;
        int star=5;
        int space=n-1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            if(i==1||i==n){
                int k=1;
                while(k<=star){
                System.out.print("* ");
                k++;
            }
            }else{
                int k=1;
                System.out.print("* ");
                while(k<=star-2){
                System.out.print("  ");
                k++;
                }
                System.out.print("* ");
            }
            space--;
            i++;
            System.out.println();
        }
    }
}


public class Loop_6{
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int space=0;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int star=5;
            while(i<=star){
                System.out.print(" *");
                star--;
            }
            System.out.println(" ");
            i++;
            space+=2;
        }
    }
}


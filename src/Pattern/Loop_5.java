public class Loop_5 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i<=n){
            int space=1;
            while(space<=i-1){
                System.out.print("  ");
                space++;
            }
            int star=5;
            while(i<=star){
                System.out.print(" *");
                star--;
            }
            System.out.println(" ");
            i++;
        }
    }
}

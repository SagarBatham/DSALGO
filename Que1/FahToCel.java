import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int minF=input.nextInt();
        int maxF=input.nextInt();
        int step=input.nextInt();
        for (int i = minF; i <= maxF; i=i+step) {
            int c=(int)((5.0/9)*(i-32));
            System.out.println(i+" "+c);
        }
    }
}

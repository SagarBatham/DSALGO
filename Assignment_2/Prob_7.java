import java.util.*;
public class Prob_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();   
        int n2 = sc.nextInt();
        int n1Phone = 0;
        int n2Phone = 0;
        int curr=1;
        while(true){  
                n1Phone += curr;
                if (n1 < n1Phone) {
                System.out.print("Harshit");
                break;
            } 
                curr++;
                n2Phone += curr;
                if (n2 < n2Phone) {
                System.out.print("Aayush");
                break;
            }
            curr++;
            }
        }
        
    }
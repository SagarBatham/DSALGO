import java.util.*;
/*Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.


Input Format
A list of integers to be processed


Constraints
All numbers input are integers between -1000 and 1000.


Output Format
Print all the numbers before the cumulative sum become negative.


Sample Input
1
2
88
-100
49
Sample Output
1
2
88*/
public class Prob_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            while (true) { 
                int n=sc.nextInt();
            if(n<0){
                break;
            }
            System.out.println(n);
            
            }
            
        } 
    }


import java.util.*;
/*Take the following as input.

A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.


Input Format

Constraints
0 < N1 < 100 0 < N2 < 100


Output Format

Sample Input
10 
4
Sample Output
5 
11 
14 
17 
23 
26 
29 
35 
38 
41
Explanation
The output will've N1 terms which are not divisible by N2.*/
public class Prob_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n2=sc.nextInt();
        int n1=sc.nextInt();
        int n=1;
        for (; 0 < n1;) {
            int mu=3*n+2;
            if(mu%n2!=0){
                System.out.println(mu);
                n1--;
            }
            n++;    
        }
    }
}

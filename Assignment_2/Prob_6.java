/*Take the following as input.

Minimum Fahrenheit value
Maximum Fahrenheit value
Step

Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
0 -17
20 -6
40 4
60 15
80 26
100 37*/

import java.util.Scanner;

public class Prob_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minF=sc.nextInt();
        int maxF=sc.nextInt();
        int step=sc.nextInt();
        for (int i = minF; i <=maxF; i+=step) {
            int c=(int)((5.0/9)*(i-32));
            System.out.println(i+"  "+c);
        }
    }
}

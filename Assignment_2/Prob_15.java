// A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number.


// Input Format
// There will be only one line of input:N , the number which needs to be checked.


// Constraints
// 1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)


// Output Format
// 1 if the number is a Boston number. 0 if the number is a not Boston number.


// Sample Input
// 378
// Sample Output
// 1
public class Prob_15 {
    public static void main(String[] args) {
        int n=378;
        int i=2;
        while(n>0){
            if((n/i)==0){
                System.out.println(i);
            }
            n=n/i;
            i++;
        }

    }
}

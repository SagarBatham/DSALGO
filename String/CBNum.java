// Deepak and Gautam are discussing a new type of number that they call Coding Blocks Number (CB Number). They use the following Rules for 
// Identifying CB Numbers.

// 1. 0 and 1 are not a CB number.
// 2. 2,3,5,7,11,13,17,19,23,29 are CB numbers.
// 3. Any number not divisible by the numbers in point 2( Given above) are also CB numbers.

// Get Piyush Kumar Singh’s stories in your inbox
// Join Medium for free to get updates from this writer.

// Enter your email
// Subscribe
// Deepak said he loved CB numbers. Hearing it, Gautam throws a challenge to him. Gautam will give Deepak a string of digits. Deepak’s task 
// is to find the number of CB numbers in the string.

// CB number once detected should not be a sub-string or super-string of any other CB number.
// Ex- In 4991, both 499 and 991 are CB numbers but you can choose either 499 or 991, not both.
// Further, the CB number formed can only be a sub-string of the string.
// Ex — In 481, you can not take 41 as the CB number because 41 is not a sub-string of 481.
// As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CB numbers that can be formed from the given string. 
// Help him by solving Gautam’s challenge.

// Sample Problem
// Let’s explore a sample input to understand the problem.

// Input
// 5  //Length of the string
// 81615 //input String

// Output:
// 2
// Explanation
// In the string “81615”, we can identify the following CB numbers:

// 61 is a CB number because it is not divisible by any of the prime numbers listed above.
// 5 is also a CB number because it is in the list of prime CB numbers above.
// These two numbers represent the maximum count of CB numbers that can be extracted without overlapping.
public class CBNum {
    public static void main(String[] args) {
        String s="4991";
        boolean[] Valid=new boolean[s.length()];
        int count=0;
        for (int len = 1; len <=s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i=j-len;
                String a=s.substring(i, j);
                long n=Integer.parseInt(a);
                if(isCNnumber(n)==true&&isValid(Valid,i,j)){
                    count++;
                    for (int k = i; k < j; k++) {
                        Valid[k]=true;
                    }
                }
            }
        }

        System.out.println(count);
    }
    public static boolean isCNnumber(Long s){
        int[] arr={2,3,5,7,11,13,17,19,23,29};
        Long str=s;
        if(str==0||str==1){
            return false;
        }

        for (int k = 0; k < arr.length; k++) {
            if(arr[k]==str){
                return true;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            if(str%arr[k]==0){
                return false;
            }
        }

        return true;
    }

    public static boolean isValid(boolean[] str,int i,int j){
        for(;i<j;i++){
            if(str[i]==true)
                return false;
        }

        return true;
    }
}

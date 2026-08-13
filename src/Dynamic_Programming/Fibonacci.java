package Dynamic_Programming;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fib(6));
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib2(6,dp));
    }

    //Recursion
    public static int fib(int n){
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        int a=fib(n-1);
        int b=fib(n-2);
        int c=a+b;
        return c;
    }

    //Memoization
    public static int fib2(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=fib2(n-1,dp)+fib2(n-2,dp);
        return dp[n];
    }
    //Tabulation
    public static int fib3(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}

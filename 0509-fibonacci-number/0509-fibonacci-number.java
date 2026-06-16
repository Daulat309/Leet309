class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        if(n<=1) return n;
        return fibo(dp,n-1)+fibo(dp,n-2);
    }

    public int fibo(int[] dp,int n){
        if(dp[n]!=-1) return dp[n];
        if(n<=1) return n;
        dp[n] = fibo(dp,n-1)+fibo(dp,n-2);
        return dp[n];
    }
}
class Solution {
    public int fib(int n) {
        if(n==0) return n;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        return fi(n, dp);
    }

    public int fi(int n, int[] dp){
        if(dp[n]!=-1) return dp[n];
        dp[n] = fi(n-1,dp) + fi(n-2, dp);
        return dp[n];
    }
}
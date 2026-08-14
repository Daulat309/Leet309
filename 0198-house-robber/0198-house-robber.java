class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return ro(0,n,dp,nums);
    }

    public int ro(int i,int n,int[] dp, int[] nums){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        dp[i] = Math.max(nums[i]+ro(i+2,n,dp,nums), ro(i+1, n, dp, nums));
        return dp[i];
    }
}
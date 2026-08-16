class Solution {
    long[][] dp = new long[100001][2];
    public long maxAlternatingSum(int[] nums) {
        for(long[] a : dp){
            Arrays.fill(a, -1);
        }
        return go(0, true, nums);
    }

    public long go(int idx, boolean flag, int[] nums){
        if(idx==nums.length) return 0;
        int m = 0;
        if(flag) m = 1;
        if(dp[idx][m]!=-1) return dp[idx][m];
        long skip = go(idx+1, flag, nums);
        long val = nums[idx];
        if(!flag) val *= -1;

        long take = go(idx+1, !flag, nums) + val;
        

        dp[idx][m] = Math.max(take, skip);

        return dp[idx][m];
        
    }
}
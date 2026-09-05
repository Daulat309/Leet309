class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int[] a : dp) Arrays.fill(a, -1);
        dp[0][0] = pt(0, 0, m-1, n-1);
        return dp[0][0];
    }

    public int pt(int i, int j, int m, int n){
        if(i>m||j>n) return 0;
        if(i==m&&j==n) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int dn = pt(i, j+1, m, n);
        int rt = pt(i+1, j, m, n);
        dp[i][j] = dn+rt;
        return dp[i][j];
    }
}
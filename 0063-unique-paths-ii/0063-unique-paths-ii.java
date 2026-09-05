// class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
//     }
// }

class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] og) {
        int m = og.length, n = og[0].length;
        
        dp = new int[m][n];

        for(int[] a : dp) Arrays.fill(a, -1);
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++) if(og[i][j]==1) dp[i][j] = 0;
        }
        dp[0][0] = pt(0, 0, m-1, n-1);
        return dp[0][0];
    }

    public int pt(int i, int j, int m, int n){
        if(i>m||j>n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==m&&j==n) return 1;
        
        int dn = pt(i, j+1, m, n);
        int rt = pt(i+1, j, m, n);
        dp[i][j] = dn+rt;
        return dp[i][j];
    }
}
class Solution {
    int[][][] dp;
    public int cherryPickup(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        dp = new int[n][n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                for(int k = 0;k<m;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        return calc(grid, 0,0,n-1);
    }


    public int calc(int[][] grid, int r, int c1, int c2){
        int m = grid.length, n = grid[0].length;
        
        if(dp[c1][c2][r]!=-1) return dp[c1][c2][r];

        int cur = grid[r][c1]+grid[r][c2];
        if(c1==c2) cur -= grid[r][c1];
        if(r==grid.length-1){
            return cur;
        }

        int mx = 0;

        for(int i = -1;i<=1;i++){
            int nc1 = c1 + i;
            for(int j = -1;j<=1;j++){
                int nc2 = c2 + j;
                if(r+1<m&&nc1<n&&nc2<n&&nc1>=0&&nc2>=0){
                    mx = Math.max(mx,calc(grid,r+1,nc1,nc2));
                }
            }
        }
        dp[c1][c2][r] = cur + mx;
        return dp[c1][c2][r];
    }
}
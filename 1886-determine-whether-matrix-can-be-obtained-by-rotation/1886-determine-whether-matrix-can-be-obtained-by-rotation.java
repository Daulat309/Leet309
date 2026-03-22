class Solution {
    public boolean findRotation(int[][] m, int[][] t) {
        int n = m.length;
        int c0 = 0, c90 = 0, c180 = 0, c270 = 0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(t[i][j]==m[i][j]) c0++;
                if(t[i][j]==m[j][n-i-1]) c90++;
                if(t[i][j]==m[n-i-1][n-j-1]) c180++;
                if(t[i][j]==m[n-j-1][i]) c270++;
            }
        }
        if(c0==n*n||c90==n*n||c180==n*n||c270==n*n) return true;
        return false;
    }
}
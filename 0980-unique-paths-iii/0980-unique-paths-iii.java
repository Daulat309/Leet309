class Solution {
    int cnt = 0;
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int uniquePathsIII(int[][] grid) {
        int starti = -1, startj = -1;
        int nobs = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==0) nobs++;
                if(grid[i][j]==1){
                    starti = i;
                    startj = j;
                }
            }
        }
        for(int k = 0;k<4;k++){
            int ni = starti + dir[k][0];
            int nj = startj + dir[k][1];
            find(grid, ni, nj, nobs, 0);
        }
        return cnt;
    }

    public void find(int[][] grid, int i, int j, int no, int c){
        if(i<0||j<0||i==grid.length||j==grid[0].length) return;
        if(grid[i][j]==2){
            if(c==no) cnt++;
            return;
        }
        if(grid[i][j]==-1||grid[i][j]==3||grid[i][j]==1) return;
        grid[i][j] = 3;
        for(int k = 0;k<4;k++){
            int ni = i + dir[k][0];
            int nj = j + dir[k][1];
            find(grid, ni, nj, no, c+1);
        }
        grid[i][j] = 0;
    }
}
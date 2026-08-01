class Solution {
    int mx = 0;
    int c = 1;
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    c = 1;
                    dfs(grid, i, j);
                    mx = Math.max(mx,c);
                }
            }
        }
        return mx;
    }

    public void dfs(int[][] a, int i, int j){
        for(int[] d : dir){
            int ni = i + d[0];
            int nj = j + d[1];
            if(ni>=0&&nj>=0&&ni<a.length&&nj<a[0].length&&a[ni][nj]==1){
                a[ni][nj] = 0;
                c++;
                dfs(a, ni, nj);
            }
        }
    }
}
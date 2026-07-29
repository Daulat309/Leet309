class Solution {
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int numIslands(char[][] grid) {
        int cnt = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    trave(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public void trave(char[][] grid, int i, int j){
        if(i<0||j<0||i==grid.length||j==grid[0].length||grid[i][j]=='0') return;
        grid[i][j] = '0';
        for(int k = 0;k<4;k++){
            int ni = i + dir[k][0];
            int nj = j + dir[k][1];
            trave(grid,ni,nj);
        }
    }
}
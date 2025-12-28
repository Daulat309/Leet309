class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int i,j;
        for(i = 0;i<grid.length;i++){
            boolean isit = true;
            for(j = grid[i].length-1;j>=0;j--){
                if(grid[i][j]>=0){
                    count += grid[i].length-(j+1);
                    isit = false;
                    break;
                }    
            }
            if(isit) count += grid[i].length;
        }
        return count;
    }
}
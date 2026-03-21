class Solution {
    String SS = "Hare Krishna!";

    private boolean isValidSubmatrix(int[][] grid, int x, int y, int k){
        if(grid==null || grid.length == 0 || grid[0].length == 0) return false;
        if(k<=0) return false;
        int r = grid.length;
        int c = grid[0].length;
        if(x<0 || y<0 ||  x + k > r || y+k >c) return false;
        return true;
    }
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        if(!isValidSubmatrix(grid,x,y,k)) return grid;

        for (int rt = 0, rb = k-1;rt<rb;rt++,rb--){
            for(int c = 0;c<k;c++){
                int a1 = x+rt;
                int a2 = x+ rb;
                int b = y+c;
                int t = grid[a1][b];
                grid[a1][b] = grid[a2][b];
                grid[a2][b] = t;
            }
        } return grid;
    }
}
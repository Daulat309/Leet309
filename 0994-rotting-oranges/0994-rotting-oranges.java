class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}
class Solution {
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int orangesRotting(int[][] grid) {
        //int mx = Math.max(grid.length, grid[0].length);
        int mx = grid.length*grid[0].length;
        int total = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1) total++;
            }
        }
        for(int rot = 0;rot<mx;rot++){
            if(total==0) return rot;
            Stack<Pair> st = new Stack<>();
            for(int i = 0;i<grid.length;i++){
                for(int j = 0;j<grid[0].length;j++){
                    if(grid[i][j]==2){
                        for(int[] d : dir){
                            int ni = i + d[0];
                            int nj = j + d[1];
                            if(ni>=0&&nj>=0&&ni<grid.length&&nj<grid[0].length&&grid[ni][nj]==1){
                            st.push(new Pair(ni,nj));
                            }
                        }
                        
                    }
                }
            }
            while(!st.isEmpty()){
                Pair p = st.pop();
                if(grid[p.i][p.j]==1){
                    grid[p.i][p.j]=2;
                    total--;
                }
            }
        }
        return total==0?mx : -1;
    }
}
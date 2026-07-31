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
        int mx = grid.length*grid[0].length;
        int total = 0;
        Queue<Pair> st = new ArrayDeque<>();
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1) total++;
                if(grid[i][j]==2) {
                    st.offer(new Pair(i,j));
                }
            }
        }
        if(total==0) return 0;
        int min = 0;
        while(!st.isEmpty()&&total>0){
            int l = st.size();
            while(l-->0){
            Pair p = st.poll();
            for(int[] d : dir){
                int ni = p.i + d[0];
                int nj = p.j + d[1];
                if(ni>=0&&nj>=0&&ni<grid.length&&nj<grid[0].length&&grid[ni][nj]==1){
                    total--;
                    grid[ni][nj]=2;
                    st.offer(new Pair(ni,nj));
                }
            }
            }
            min++;
        }
        return total==0?min : -1;
    }
}
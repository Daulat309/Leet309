class Solution {
    boolean res = true;
    public boolean isBipartite(int[][] graph) {
        int[] col = new int[graph.length];
        Arrays.fill(col, -1);
        for(int i = 0;i<graph.length;i++){
            if(col[i]==-1){
                col[i] = 1;
                dfs(graph,i,col);
                if(!res) return false;
            }
        }
        return true;
    }

    public void dfs(int[][] grid, int i, int[] col){
                    for(int k : grid[i]){
                        if(col[k]!=-1&&col[k]==col[i]){
                            res = false;
                            return;
                        }
                        
                        if(col[k]==-1){
                            if(col[i]==1) col[k] = 2;
                            else col[k] = 1;
                            dfs(grid,k,col);
                        }
                    }
    }
}
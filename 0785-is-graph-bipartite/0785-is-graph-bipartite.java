class Solution {
    boolean res = true;
    public boolean isBipartite(int[][] graph) {
        int[] col = new int[graph.length];
        Arrays.fill(col, -1);
        boolean[] vis = new boolean[graph.length];
        for(int i = 0;i<graph.length;i++){
            if(!vis[i]){
                vis[i] = true;
                col[i] = 1;
                dfs(graph,i,vis,col);
                if(!res) return false;
            }
        }
        return true;
    }

    public void dfs(int[][] grid, int i,boolean[] vis,int[] col){
        vis[i] = true;
                    for(int k : grid[i]){
                        if(vis[k]&&col[k]==col[i]){
                            res = false;
                            return;
                        }
                        if(col[i]==1) col[k] = 2;
                        else col[k] = 1;
                        if(!vis[k]) dfs(grid,k,vis,col);
                    }
    }
}
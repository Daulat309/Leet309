class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] col = new int[graph.length];
        Arrays.fill(col,-1);
        for(int i = 0;i<graph.length;i++){
            if(col[i]==-1){
                col[i] = 1;
                if(!dfs(graph,i,col)) return false;
            }
        }
        return true;
    }

    public boolean dfs(int[][] graph, int i, int[] col ){
        for(int k : graph[i]){
            if(col[k]!=-1&&col[k]==col[i]) return false;
            else if(col[k]==-1){
                col[k] = 3 - col[i];
                if(!dfs(graph,k,col)) return false;
            }
        }
        return true;
    }
}
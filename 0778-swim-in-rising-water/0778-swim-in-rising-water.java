class Pair{
    int i;
    int j;
    int x;
    Pair(int i, int j, int x){
        this.i = i;
        this.j = j;
        this.x = x;
    }
}
class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length-1;
        int m = grid[0].length-1;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        boolean[][] vis = new boolean[n+1][m+1];
        int mn = Integer.MAX_VALUE;
        Queue<Pair> q = new PriorityQueue<>(
            (a,b) -> {return Integer.compare(a.x,b.x);}
        );
        q.offer(new Pair(0,0,grid[0][0]));
        while(!q.isEmpty()){
            Pair p = q.poll();
            int i = p.i;
            int j = p.j;
            int x = p.x;
            vis[i][j] = true;
            if(i==n&&j==m){
                return x;
            }
            for(int k = 0;k<4;k++){
                int ni = i + dx[k];
                int nj = j + dy[k];
                if(ni>=0&&nj>=0&&ni<=n&&nj<=m&&!vis[ni][nj]){
                    System.out.println("Inserted");
                    q.offer(new Pair(ni,nj,Math.max(x,grid[ni][nj])));
                }
            }
        }
        return mn;
    }
}
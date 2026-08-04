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
    int[] dx = {0,1,0,-1};
    int[] dy = {1,0,-1,0};
    // public int swimInWater(int[][] grid) {
    //     int n = grid.length-1;
    //     int m = grid[0].length-1;

    //     boolean[][] vis = new boolean[n+1][m+1];
    //     Queue<Pair> q = new PriorityQueue<>(
    //         (a,b) -> {return Integer.compare(a.x,b.x);}
    //     );
    //     q.offer(new Pair(0,0,grid[0][0]));
    //     vis[0][0] = true;
    //     while(!q.isEmpty()){
    //         Pair p = q.poll();
    //         int i = p.i;
    //         int j = p.j;
    //         int x = p.x;
    //         if(i==n&&j==m){
    //             return x;
    //         }
    //         for(int k = 0;k<4;k++){
    //             int ni = i + dx[k];
    //             int nj = j + dy[k];
    //             if(ni>=0&&nj>=0&&ni<=n&&nj<=m&&!vis[ni][nj]){
    //                 vis[i][j] = true;
    //                 q.offer(new Pair(ni,nj,Math.max(x,grid[ni][nj])));
    //             }
    //         }
    //     }
    //     return mn;
    // }
    public int swimInWater(int[][] grid) {
        int n = grid.length-1;
        int m = grid[0].length-1;
        int l = grid[0][0];
        int h = 0;
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=m;j++){
                h = Math.max(grid[i][j],h);
            }
        }
        while(l<h){
            int md  = l + (h-l)/2;
            if(bfs(grid,0,0,md)) h = md;
            else l = md + 1;
        }
        return l;
    }


    public boolean bfs(int[][] a, int si, int sj, int x) {
    int n = a.length;
    int m = a[0].length;

    boolean[][] vis = new boolean[n][m];
    Queue<int[]> q = new LinkedList<>();

    q.offer(new int[]{si, sj});
    vis[si][sj] = true;

    while (!q.isEmpty()) {
        int[] cur = q.poll();
        int i = cur[0];
        int j = cur[1];

        if (i == n - 1 && j == m - 1) {
            return true;
        }

        for (int k = 0; k < 4; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];

            if (ni >= 0 && nj >= 0 && ni < n && nj < m &&
                !vis[ni][nj] && a[ni][nj] <= x) {

                vis[ni][nj] = true;
                q.offer(new int[]{ni, nj});
            }
        }
    }

    return false;
    }
}
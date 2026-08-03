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
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int minimumEffortPath(int[][] h) {
        int[][] dist = new int[h.length][h[0].length];
        for(int[] a : dist){
            Arrays.fill(a, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        Queue<Pair> q = new PriorityQueue<>(
            (a,b) ->{
                return Integer.compare(a.x,b.x);
            }
        );
        q.offer(new Pair(0,0,0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            int i = p.i;
            int j = p.j;
            int x = p.x;
            if(x!=dist[i][j]) continue;
            for(int[] d : dir){
                int ni = i + d[0];
                int nj = j + d[1];

                if(ni>=0&&nj>=0&&ni<h.length&&nj<h[0].length){
                    int df = Math.abs(h[i][j]-h[ni][nj]);
                    int mx = Math.max(df,x);
                    if(dist[ni][nj]>mx){
                        dist[ni][nj] = mx;
                        q.offer(new Pair(ni,nj,mx));
                    }
                }
            }
        }
        return dist[h.length-1][h[0].length-1];
    }
}
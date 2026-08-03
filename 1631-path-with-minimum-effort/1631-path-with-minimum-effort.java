class Pair{
    int i, j, x;
    Pair(int i, int j, int x){
        this.i = i;
        this.j = j;
        this.x = x;
    }
}

class Solution {

    int[] dr = {0,1,0,-1};
    int[] dc = {1,0,-1,0};

    public int minimumEffortPath(int[][] h) {

        int n = h.length;
        int m = h[0].length;

        int[][] dist = new int[n][m];
        for(int[] a : dist)
            Arrays.fill(a, Integer.MAX_VALUE);

        PriorityQueue<Pair> q =
            new PriorityQueue<>((a,b) -> Integer.compare(a.x,b.x));

        dist[0][0] = 0;
        q.offer(new Pair(0,0,0));

        while(!q.isEmpty()){

            Pair p = q.poll();

            if(p.x != dist[p.i][p.j]) continue;

            if(p.i == n-1 && p.j == m-1)
                return p.x;

            for(int k=0;k<4;k++){

                int ni = p.i + dr[k];
                int nj = p.j + dc[k];

                if(ni>=0 && nj>=0 && ni<n && nj<m){

                    int mx = Math.max(p.x,
                            Math.abs(h[p.i][p.j]-h[ni][nj]));

                    if(mx < dist[ni][nj]){
                        dist[ni][nj] = mx;
                        q.offer(new Pair(ni,nj,mx));
                    }
                }
            }
        }

        return 0;
    }
}
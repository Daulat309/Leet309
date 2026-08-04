class Pair {
    int i, j, t;

    Pair(int i, int j, int t) {
        this.i = i;
        this.j = j;
        this.t = t;
    }
}

class Solution {
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {1, 0, -1, 0};

    public int swimInWater(int[][] grid) {
        int n = grid.length;

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.t, b.t)
        );

        boolean[][] vis = new boolean[n][n];

        pq.offer(new Pair(0, 0, grid[0][0]));
        vis[0][0] = true;

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();

            if (cur.i == n - 1 && cur.j == n - 1)
                return cur.t;

            for (int k = 0; k < 4; k++) {
                int ni = cur.i + dx[k];
                int nj = cur.j + dy[k];

                if (ni >= 0 && nj >= 0 && ni < n && nj < n && !vis[ni][nj]) {
                    vis[ni][nj] = true;
                    pq.offer(new Pair(
                        ni,
                        nj,
                        Math.max(cur.t, grid[ni][nj])
                    ));
                }
            }
        }

        return -1;
    }
}
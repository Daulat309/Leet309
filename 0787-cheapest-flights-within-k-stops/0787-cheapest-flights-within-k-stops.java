class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int INF = (int)1e8;
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] temp = dist.clone();
            boolean updated = false;

            for (int[] f : flights) {
                int u = f[0], v = f[1], w = f[2];

                if (dist[u] != INF && dist[u] + w < temp[v]) {
                    temp[v] = dist[u] + w;
                    updated = true;
                }
            }

            dist = temp;
            if (!updated) break;
        }

        return dist[dst] == INF ? -1 : dist[dst];
    }
}
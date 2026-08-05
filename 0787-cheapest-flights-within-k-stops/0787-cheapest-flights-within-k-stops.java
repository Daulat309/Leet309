class Solution {
    public int findCheapestPrice(int n, int[][] edges, int src, int dst, int k) {
        int INF = (int)1e8;
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        int[] temp = new int[n];
        Arrays.fill(temp, INF);
        dist[src] = 0; 

        for(int i = 0; i <= k; i++){
            for(int[] e : edges){
                int s = e[0], d = e[1], x = e[2];
                if(dist[s] != INF && dist[s] + x < temp[d]){
                    temp[d] = dist[s] + x;
                }
            }
            for(int m = 0;m<n;m++){
                dist[m] = temp[m];
            }
        }
        return dist[dst]==INF? -1 : dist[dst];
    }
}
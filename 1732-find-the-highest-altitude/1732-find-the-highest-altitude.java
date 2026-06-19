class Solution {
    public int largestAltitude(int[] g) {
        int cur = 0, mx = 0;
        for(int i = 0;i<g.length;i++){
            cur += g[i];
            mx = Math.max(cur,mx);
        }
        return mx;
    }
}
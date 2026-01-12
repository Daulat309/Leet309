class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int count = 0;
        for(int i = 0;i<p.length-1;i++){
            int x = p[i][0];
            int y = p[i][1];
            int x1 = p[i+1][0];
            int y1 = p[i+1][1];
            count += Math.max(Math.abs(x1-x),Math.abs(y1-y));
        }
        return count;
    }
}
class Solution {
    public int removeCoveredIntervals(int[][] in) {
        Arrays.sort(in,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
            }
        );
        int cnt = 0;
        int s = in[0][0];
        int e = in[0][1];
        for(int i = 1;i<in.length;i++){
            if(s<=in[i][0]&&in[i][1]<=e) cnt++;
            else{
               s = in[i][0];
               e = in[i][1];
            }
        }
        return in.length-cnt;
    }
}
class Solution {
    public int hIndex(int[] c) {
        int l = 0, h = c.length-1, n = h + 1, res = 0;
        while(l<=h){
            int m = l + (h-l)/2;
            if(c[m]>=n-m){
                res = n-m;
                h = m - 1;
            }
            else l = m + 1;
        }
        return res;
    }
}
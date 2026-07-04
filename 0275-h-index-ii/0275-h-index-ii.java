class Solution {
    public int hIndex(int[] c) {
        int l = 0, h = c.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            int rq = c.length - m;
            if(c[m]>=rq) h = m -1;
            else l = m + 1;
        }
        return c.length-l;
    }
}
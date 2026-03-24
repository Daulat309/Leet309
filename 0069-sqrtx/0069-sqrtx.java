class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int l = Math.min(1, x),h = Math.max(1, x), r = 0;
        while(l<=h){
            int m = l + (h-l)/2;
            if(m<=x/m){
                r = m;
                l = m+1;
            }
            else h = m-1;
        }
        return r;
    }
}
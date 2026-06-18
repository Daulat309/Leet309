class Solution {
    public int maximumCandies(int[] c, long k) {
        long l = 1, h = Integer.MIN_VALUE;
        long r = 0;
        for(int i : c) h = Math.max(h,i);
        long mx = h;
        while(l<=h){
            long m = l + (h-l)/2;
            long cur = 0;
            for(int i = 0;i<c.length;i++){
                cur += c[i]/m;
            }
            if((cur/k)>0){
                r = (cur/k)*m;
                l = m + 1;
            }
            else h = m-1;
        }
        r = Math.min(mx,r);
        return (int)r;
    }
}
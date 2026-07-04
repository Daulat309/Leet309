class Solution {
    public int maximumCandies(int[] c, long k) {
        int l = 0, h = l;
        for(int i : c) h = Math.max(i,h);
        while(l<=h){
            int m = l + (h-l)/2;
            if(isp(c,m,k)){
                l = m + 1;
            }
            else h = m - 1;
        }
        return h;
    }

    public boolean isp(int[] a, int c, long k){
        long cnt = 0;
        if(c==0) return true;
        for(int i = 0;i<a.length;i++){
            cnt += a[i]/c;
        }
        return cnt>=k;
    }
}
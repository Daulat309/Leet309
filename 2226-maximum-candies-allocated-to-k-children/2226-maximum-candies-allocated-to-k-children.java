class Solution {
    public int maximumCandies(int[] c, long k) {
        int l = 0, h = l,res = 0;
        for(int i : c) h = Math.max(i,h);
        while(l<=h){
            int m = l + (h-l)/2;
            if(isp(c,m,k)){
                res = m;
                l = m + 1;
            }
            else h = m - 1;
        }
        return res;
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
class Solution {
    public int hIndex(int[] c) {
        int mx = Integer.MAX_VALUE;
        for(int i : c) mx = Math.max(mx,i);
        int l = 0, h = mx, res = 0;
        while(l<=h){
            int m = l + (h-l)/2;
            if(mikecheck(c,m)){
                res = m;
                l = m + 1;
            }
            else h = m - 1;
        }
        return res;
    }

    public boolean mikecheck(int[] a, int m){
        int cnt = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]>=m) cnt++;
            if(cnt>=m) return true;
        }
        return false;
    }
}
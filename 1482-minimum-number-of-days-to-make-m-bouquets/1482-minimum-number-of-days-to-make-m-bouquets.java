class Solution {
    public int minDays(int[] bld, int m, int k) {
        if(bld.length<m*k) return -1;
        int mx = Integer.MIN_VALUE;
        for(int i : bld) mx = Math.max(mx,i);
        int l = 1, h = mx, rs = -1;
        while(l<=h){
            int md = l + (h-l)/2;
            int fin = 0, cur = 0;
            for(int i = 0;i<bld.length;i++){
                if(bld[i]<=md) cur++;
                else cur = 0;
                if(cur==k){
                    fin++;
                    cur=0;
                }
            }
            if(fin>=m){
                h = md-1;
                rs = md;
            }
            else l = md + 1;
        }
        return rs;
    }
}
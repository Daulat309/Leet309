class Solution {
    int[] segT;
    int n;
    public int[] leftmostBuildingQueries(int[] h, int[][] qr) {
    n = h.length;
    segT = new int[4 * n];
    buildT(0, 0, n - 1, h);

    int[] ans = new int[qr.length];
    int k = 0;

    for (int[] q : qr) {
        int a = Math.min(q[0], q[1]);
        int b = Math.max(q[0], q[1]);

        if (a == b) {
            ans[k++] = a;
            continue;
        }

        if (h[a] < h[b]) {
            ans[k++] = b;
            continue;
        }


        int l = b + 1;
        int r = n - 1;
        int res = -1;

        while (l <= r) {
            int md = l + (r - l) / 2;

            
            int idx = get(0, l, md, 0, n - 1, h);

            if (h[idx] > h[a]) {
                
                res = idx;
                r = md - 1;
            } else {
                
                l = md + 1;
            }
        }

        ans[k++] = res;
    }

    return ans;
}

    public void buildT(int idx, int l, int r, int[] a){
        if(l==r){
            segT[idx] = l;
            return;
        }
        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;

        buildT(lft, l, md, a);
        buildT(rht, md+1, r, a);

        int lf = a[segT[lft]];
        int rh = a[segT[rht]];
        if(lf>rh){
            segT[idx] = segT[lft];
        }
        else{
            segT[idx] = segT[rht];
        }
    }

    public int get(int idx, int i, int j, int l, int r, int[] h){
        if(r<i||j<l){
            return -1;
        }

        if(i<=l&&r<=j){
            return segT[idx];
        }

        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;

        int lf = get(lft,i, j, l,md, h);
        int rh = get(rht, i, j, md+1, r, h);
        if(lf==-1) return rh;
        if(rh==-1) return lf;
        return h[rh]>h[lf]? rh : lf;
    }


}
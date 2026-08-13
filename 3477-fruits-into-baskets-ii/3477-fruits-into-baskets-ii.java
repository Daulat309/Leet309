class Solution {
    int[] segT;
    int n;
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int cnt = 0;
        n = b.length;
        segT = new int[4*n];
        buildT(0, 0, n-1, b);
        for(int i = 0;i<f.length;i++){
            int cur = get(0,0,n-1,f[i]);
            if(cur==-1) cnt++;
            else{
                update(0,cur,0, n-1 );
            }
            
        }
        return cnt;
    }

    public void buildT(int idx, int l, int r, int[] b){
        if(l==r){
            segT[idx] = b[l];
            return;
        }

        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;
        buildT(lft, l, md, b);
        buildT(rht, md+1, r, b);
        segT[idx] = Math.max(segT[lft], segT[rht]);
    }

    public int get(int idx, int l, int r, int k){
        if(segT[idx]<k) return -1;
        if(l==r){
            return l;
        }
        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;
        if(segT[lft]>=k) return get(lft, l, md, k);
        return get(rht, md+1, r, k);
    }

    public void update(int idx, int i, int l, int r){
        if(l==r){
            segT[idx] = -1;
            return;
        }
        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;

        if(i<=md){
            update(lft, i, l, md);
        }
        else update(rht, i, md+1, r);

        segT[idx] = Math.max(segT[lft], segT[rht]);
    }
}
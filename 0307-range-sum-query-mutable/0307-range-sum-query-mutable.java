class NumArray {
    int n;
    int[] segT;
    public NumArray(int[] nums) {
        n = nums.length;
        segT = new int[4*n];
        buildT(0,0,n-1,nums, segT);
    }
    
    public void update(int index, int val) {
        iupd(0,index, 0, n-1,segT,val);
    }
    
    public int sumRange(int left, int right) {
        return rsum(0,left,right,0,n-1,segT);
    }

    public void buildT(int idx, int l, int r, int[] a, int[] segT){
        if(l==r){
            segT[idx] = a[l];
            return;
        }
        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;
        buildT(lft,l,md,a,segT);
        buildT(rht,md+1,r,a,segT);
        segT[idx] = segT[lft]+segT[rht];
    }


    public int rsum(int idx,int i, int j, int l, int r, int[] segT){
        if(r<i||j<l) return 0;
        if(i<=l&&r<=j) return segT[idx];
        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;
        return rsum(lft,i,j,l,md,segT) + rsum(rht,i,j,md+1,r,segT);
    }

    public void iupd(int idx, int i, int l, int r, int[] segT, int k){
        if(l==r){
            segT[idx] = k;
            return;
        }
        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;

        if(i<=md){
            iupd(lft,i,l,md,segT, k);
        }
        else{
            iupd(rht,i,md+1,r,segT, k);
        }
        segT[idx] = segT[lft]+segT[rht];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
class NumArray {
    int n;
    int[] segT;
    public NumArray(int[] nums) {
        n = nums.length;
        segT = new int[4*n];
        buildT(0,0,n-1,nums);
    }
    
    public int sumRange(int left, int right) {
        return rsum(0,left, right, 0, n-1);
    }

    public void buildT(int idx, int l, int r, int[] a){
        if(l==r){
            segT[idx] = a[l];
            return;
        }
        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;
        buildT(lft,l,md,a);
        buildT(rht,md+1,r,a);
        segT[idx] = segT[lft]+segT[rht];
    }

    public int rsum(int idx, int i, int j, int l, int r){
        if(r<i||j<l) return 0;
        if(i<=l&&r<=j) return segT[idx];
        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;
        return rsum(lft,i, j, l, md) + rsum(rht,i, j, md+1, r);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
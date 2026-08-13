class Solution {
    int[] id;
    int[] segT;
    public long goodTriplets(int[] nums1, int[] nums2) {
        long res = 0;
        int n = nums1.length;
        id = new int[n];
        for(int i = 0;i<nums2.length;i++){
            id[nums2[i]] = i;
        }
        segT = new int[4*n];

        for(int i = 0;i<nums1.length;i++){
            int num = nums1[i];
            int ind = id[num];
            int lftcmn = cnt(0,0,ind-1, 0, n-1);
            int usedRight = cnt(0, ind + 1, n - 1, 0, n - 1);
            int totalRight = n - ind - 1; 
            int rhtcmn = totalRight - usedRight;
            res += (long) lftcmn*rhtcmn;
            mark(0, ind, 0, n-1);
        }
        return res;
    }

    public void mark(int idx, int i, int l, int r){
        if(l==r){
            segT[idx] = 1;
            return;
        }
        int lft = 2*idx+1;
        int rht = 2*idx+2;
        int md = l + (r-l)/2;

        if(i<=md){
            mark(lft, i, l, md);
        }
        else{
            mark(rht, i, md+1, r);
        }
        segT[idx] = segT[lft] + segT[rht];
    }

    public int cnt(int idx, int i, int j, int l, int r){
        if(r<i||j<l) return 0;
        if(i<=l&&r<=j) return segT[idx];
        int md = l + (r-l)/2;
        int lft = 2*idx+1;
        int rht = 2*idx+2;

        return cnt(lft, i, j, l, md) + cnt(rht, i, j, md+1, r);
    }
}
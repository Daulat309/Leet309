class Solution {
    public int search(int[] nums, int target) {
        return bs(0,nums.length-1,nums,target);
    }

    public int bs(int l, int h, int[] a, int x){
        if(l>h) return -1;
        int m = l + (h-l)/2;
        if(a[m]==x) return m;
        if(a[m]<x) return bs(m+1,h,a,x);
        return bs(l,m-1,a,x);
    }
}
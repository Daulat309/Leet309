class Solution {
    public int search(int[] nums, int target) {
        return bS(nums,target,0,nums.length-1);
    }

    public static int bS(int[] a, int x, int l, int e){
        if(l>e) return -1;
        int m = l + (e-l)/2;
        if(a[m]==x) return m;
        if(a[m]<x) return bS(a,x,m+1,e);
        return bS(a,x,l,m-1);
    }
}
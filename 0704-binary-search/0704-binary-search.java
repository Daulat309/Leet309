class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length-1);
    }

    public int bs(int[] a, int x, int s, int e){
        if(s>e) return -1;
        int m = s + (e-s)/2;
        if(a[m]==x) return m;
        if(a[m]<x) return bs(a, x, m+1, e);
        return bs(a, x, s, m-1);
    }
}
class Solution {
    public int search(int[] nums, int target) {
        return bS(0,nums.length-1,nums,target);
    }

    public int bS(int l, int h, int[] a, int x){
        if(l>h) return -1;
        int m = l + (h-l)/2;
        if(a[m]==x) return m;
        if(a[l]<=a[m]){
            if(a[l]<=x&&x<a[m]) return bS(l,m-1,a,x);
            return bS(m+1,h,a,x);
        }
        else{
            if(a[m]<x&&x<=a[h]) return bS(m+1,h,a,x);
           return bS(l,m-1,a,x);
        }
    } 
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1, -1};
        int ll = lb(nums, target);
        int hh = ub(nums, target);
        return ll==-1? new int[]{-1, -1} : new int[]{ll, hh-1};
    }


    public int lb(int[] a, int x){
        int l  = 0 , h = a.length-1;
        while(l<=h){
            int md = l + (h-l)/2;
            if(a[md]>=x) h = md-1;
            else l = md + 1;
        }
        return l==a.length?-1:a[l]==x?l:-1;
    }

    public int ub(int[] a, int x){
        int l = 0, h = a.length-1;
        while(l<=h){
            int md = l + (h-l)/2;
            if(a[md]>x) h = md - 1;
            else l = md + 1;
        }
        return l;
    }
}
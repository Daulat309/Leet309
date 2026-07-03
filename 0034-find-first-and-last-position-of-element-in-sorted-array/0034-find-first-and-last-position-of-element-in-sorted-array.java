class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = fo(nums,target);
        int ub = lo(nums,target);
        return lb!=-1?new int[]{lb,ub}:new int[]{-1,-1};
    }


    public int fo(int[] a,int x){
        int l = 0, h = a.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(a[m]>=x){
                h = m - 1;
            }
            else l = m + 1;
        }
        return l == a.length||a[l]!=x?-1:l;
    }

    public int lo(int[] a,int x){
        int l = 0, h = a.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(a[m]<=x){
                l = m + 1;
            }
            else h = m - 1;
        }
        return h;
    }

}
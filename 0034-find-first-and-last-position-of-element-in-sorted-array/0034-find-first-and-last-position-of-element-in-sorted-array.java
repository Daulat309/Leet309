class Solution {
    public static int lb(int ar[], int x){
        int l = 0;
        int h = ar.length-1;
        while(l<=h){
            int mid = l +(h-l)/2;
            if(ar[mid]>=x) h = mid-1;
            else l = mid+1;
        }
        return l;
    }

    public static int ub(int ar[], int x){
        int l = 0;
        int h = ar.length-1;
        int ub = ar.length;
        while(l<=h){
            int mid = l +(h-l)/2;
            if(ar[mid]>x){
                ub = mid;
                h = mid-1;
            }
            else l = mid + 1;
        }
        return ub;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ar = new int[2];
        int llb = lb(nums,target);
        if(nums.length==0 ||(llb==nums.length || nums[llb]!=target)){
            ar[0] = -1;
            ar[1] = -1;
            return ar;
        }
        int uub = ub(nums,target) - 1;
        ar[0] = llb;
        ar[1] = uub;
        return ar;
    }
}
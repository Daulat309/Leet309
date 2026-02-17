class Solution {

    public static int lb(int[] ar, int x){
        int l = 0;
        int h = ar.length-1;
        while(l<=h){
            int mid = l +(h-l)/2;
            if(ar[mid]>=x) h = mid-1;
            else l = mid + 1;
        }
        return l;
    }
    public int searchInsert(int[] nums, int target) {
        return lb(nums,target);
    }
}
class Solution {
    static int lowerbound(int[] arr, int element, int lb, int ub){
        if(lb>ub) return lb;
        int mid = lb + (ub-lb)/2;
        if(arr[mid]>=element) return lowerbound(arr,element,lb,mid-1);
        else return lowerbound(arr,element,mid+1,ub);
    }
    public int searchInsert(int[] nums, int target) {
        return lowerbound(nums,target,0,nums.length-1);
    }
}
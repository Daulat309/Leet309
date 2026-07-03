class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int l = 1, h = nums.length-2;
        while(l<=h){
            int m = l + (h-l)/2;
            if(nums[m]>nums[m+1]) h = m-1;
            else l = m + 1;
        }
        return l;
    }
}
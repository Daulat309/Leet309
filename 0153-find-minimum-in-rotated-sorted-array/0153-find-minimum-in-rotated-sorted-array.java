class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(nums[m]>nums[nums.length-1]){
                l = m + 1;
            }
            else h = m -1;
        }
        return nums[l];
    }
}
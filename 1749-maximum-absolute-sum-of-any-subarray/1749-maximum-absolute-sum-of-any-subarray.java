class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int res = Math.max(Math.abs(min),Math.abs(max));
        for(int i = 1;i<nums.length;i++){
            min = Math.min(nums[i],min+nums[i]);
            max = Math.max(nums[i]+max, nums[i]);
            res =  Math.max(res, Math.max(Math.abs(min),Math.abs(max)));
        }
        return res;
    }
}
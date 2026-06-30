class Solution {
    public int maximumSum(int[] nums) {
        int nd = nums[0];
        int od = 0;
        int res = nums[0];
        for(int i = 1;i<nums.length;i++){
            od = Math.max(nd,od+nums[i]);
            nd = Math.max(nums[i],nd+nums[i]);
            res = Math.max(res,Math.max(nd,od));
        }
        return res;
    }
}
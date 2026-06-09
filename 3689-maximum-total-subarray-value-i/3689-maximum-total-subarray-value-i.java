class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = (long)Integer.MAX_VALUE;
        long max = (long)Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        return k * (max-min);
    }
}
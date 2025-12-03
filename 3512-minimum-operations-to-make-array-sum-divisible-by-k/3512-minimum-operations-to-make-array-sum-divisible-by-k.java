class Solution {
    public int minOperations(int[] nums, int k) {
        int l = nums.length;
        for(int i = 1;i<l;i++) nums[0] += nums[i];
        return nums[0] % k;
    }
}
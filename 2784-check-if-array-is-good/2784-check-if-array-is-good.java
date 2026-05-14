class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int s = nums[0];
        for(int i = 1;i<nums.length;i++){
            s += nums[i];
            s -= i;
        }
        return s==n-1&&nums[n-1]==n-1&&nums[0]==1&&nums[n-1]==nums[n-2];
    }
}
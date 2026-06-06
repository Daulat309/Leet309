class Solution {
    public int[] leftRightDifference(int[] nums) {
       int r = 0, l = 0;
       for(int i : nums) r += i;
       for(int i = 0;i<nums.length;i++){
        r -= nums[i];
        int t = nums[i];
        nums[i] = Math.abs(r-l);
        l += t;
       }
       return nums;
    }
}
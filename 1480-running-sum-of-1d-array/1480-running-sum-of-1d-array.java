class Solution {
    public int[] runningSum(int[] nums) {
        int s = 0;
        int l = nums.length;
        for(int i = 0;i<l;i++){
            s += nums[i];
            nums[i] = s;
        }
        return nums;
    }
}
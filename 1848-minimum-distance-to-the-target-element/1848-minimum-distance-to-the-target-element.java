class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        for (int d = 0; d < nums.length; d++) {
            if (start - d >= 0 && nums[start - d] == target) return d;
            if (start + d < nums.length && nums[start + d] == target) return d;
        }
        return 0;
    }
}
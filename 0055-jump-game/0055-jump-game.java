class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int cur = 0;
        for(int i = 0;i<nums.length-1;i++){
            nums[i] = i + nums[i];
            cur = Math.max(cur, nums[i]);
            if(cur>=nums.length-1) return true;
            if(cur<i+1) return false;
        }
        return true;
    }
}
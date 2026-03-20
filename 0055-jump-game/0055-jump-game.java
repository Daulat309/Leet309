class Solution {
    public boolean canJump(int[] nums) {
        int cp = 0;
        for(int i = 0;i<nums.length-1;i++){
            cp = Math.max(cp,nums[i] + i);
            if(cp<i+1) return false;
            if(nums.length-1-nums[i]-i<=0) return true;
        }
        return true;
    }
}
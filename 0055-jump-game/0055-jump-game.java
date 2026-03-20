class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<2) return true;
        int cp = 0;
        for(int i = 0;i<nums.length-1;i++){
            cp = Math.max(cp,nums[i] + i);
            if(cp<i+1) return false;
        }
        return true;
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int pre = 0;
        int suf = 0;
        for(int i = 0;i<nums.length;i++){
            suf += nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            suf -= nums[i];
            if(suf==pre) return i;
            pre += nums[i];
        }
        return -1;
    }
}
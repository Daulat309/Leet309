class Solution {
    public int pivotIndex(int[] nums) {
        int r = 0;
        for(int i : nums) r += i;
        int l = 0;
        for(int i = 0;i<nums.length;i++){
            r -= nums[i];
            if(r==l) return i;
            l += nums[i];
        }
        return -1;
    }
}
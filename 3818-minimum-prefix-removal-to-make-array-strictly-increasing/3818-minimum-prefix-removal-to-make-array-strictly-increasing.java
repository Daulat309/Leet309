class Solution {
    public int minimumPrefixLength(int[] nums) {
        int count = 0;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]>=nums[i+1]) return i+1;
        }
        return count;
    }
}
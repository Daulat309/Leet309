class Solution {
    public int pivotIndex(int[] nums) {
        int s = 0;
        for(int i : nums) s += i;
        int l = 0;
        for(int i = 0;i<nums.length;i++){
            if(i>0)l += nums[i-1];
            s -= nums[i];
            if(s==l) return i;
        }
        return -1;
    }
}
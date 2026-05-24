class Solution {
    public int pivotIndex(int[] nums) {
        int s = 0;
        for(int i : nums) s += i;
        int l = 0;
        for(int i = 0;i<nums.length;i++){
            if(s-l-nums[i]==l) return i;
            l += nums[i];
        }
        return -1;
    }
}
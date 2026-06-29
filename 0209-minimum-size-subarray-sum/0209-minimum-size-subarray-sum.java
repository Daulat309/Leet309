class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, h = 0, mn = Integer.MAX_VALUE, s = 0;
        while(h<nums.length){
            s += nums[h];
            while(s>=target){
                mn = Math.min(h-l+1,mn);
                s -= nums[l];
                l++;
            }
            h++;
        }
        return mn==Integer.MAX_VALUE?0:mn;
    }
}
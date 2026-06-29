class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, h= 0;
        int s = 0, res = Integer.MAX_VALUE;
        while(h<nums.length){
            s += nums[h];
            while(s>=target){
                res = Math.min(res,h-l+1);
                s -= nums[l];
                l++;
            }
            h++;
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
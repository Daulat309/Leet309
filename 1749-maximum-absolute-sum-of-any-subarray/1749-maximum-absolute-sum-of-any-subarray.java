class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int h = 0, mx = 0, mn =0,mncur = nums[0], mxcur = nums[0],res =0;
        while(h<nums.length){
            mx = Math.max(mx+nums[h],nums[h]);
            mn = Math.min(mn+nums[h],nums[h]);
            res = Math.max(res,Math.max(mx,Math.abs(mn)));
            h++;
        }
        return res;
    }
}
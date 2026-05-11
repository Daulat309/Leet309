class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int h = 1, mx = nums[0], mn = nums[0],mncur = nums[0], mxcur = nums[0],res = Math.abs(nums[0]);
        while(h<nums.length){
            mxcur = Math.max(mxcur+nums[h],nums[h]);
            mncur = Math.min(mncur+nums[h],nums[h]);
            mx = Math.max(mx,mxcur);
            mn = Math.min(mn,mncur);
            res = Math.max(Math.abs(mx),Math.abs(mn));
            h++;
        }
        return res;
    }
}
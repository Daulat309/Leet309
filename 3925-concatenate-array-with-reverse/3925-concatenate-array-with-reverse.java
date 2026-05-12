class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] res = new int[2*nums.length];
        int l = 0, h = res.length-1;
        while(l<nums.length){
            res[l] = nums[l];
            res[h-l] = nums[l];
            l++;
        }
        return res;
    }
}
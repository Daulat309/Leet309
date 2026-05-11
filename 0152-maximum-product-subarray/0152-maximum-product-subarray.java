class Solution {
    public int maxProduct(int[] nums) {
        int h = 1, cur = nums[0], mx = nums[0], ng = nums[0];
        while(h<nums.length){
            int cr = cur;
            cur =Math.max(ng*nums[h],Math.max(nums[h]*cur, nums[h]));
            mx = Math.max(mx, cur);
            ng = Math.min(cr*nums[h],Math.min(ng*nums[h], nums[h]));
            h++;
        }
        return mx;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int h = 1, cur = nums[0], mx = nums[0], ng = nums[0];
        while(h<nums.length){
            int a = nums[h];
            int b = ng*nums[h];
            int c = cur*nums[h];
            cur =Math.max(a,Math.max(b,c));
            mx = Math.max(mx, cur);
            ng = Math.min(a,Math.min(b,c));
            h++;
        }
        return mx;
    }
}
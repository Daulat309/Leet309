class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int res = max;

        for(int i = 1;i<nums.length;i++){
            int a = nums[i];
            int b = nums[i]*max;
            int c = nums[i]*min;
            max = Math.max(a,Math.max(b,c));
            min = Math.min(a,Math.min(b,c));
            res = Math.max(max,res);
        }
        return res;
    }
}
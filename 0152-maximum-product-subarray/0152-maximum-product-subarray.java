class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0], mx = min;
        for(int i = 1;i<nums.length;i++){
            int a = nums[i];
            int b = nums[i]*nums[i-1];
            int c = nums[i]*min;
            min =  Math.min(a,Math.min(b,c));
            nums[i] = Math.max(a,Math.max(b,c));
            mx = Math.max(mx,nums[i]);
        }
        return mx;
    }
}
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int p1 = nums[0];
        if(n==1) return p1;
        int p2 = Math.max(p1, nums[1]);
        for(int i = 2;i<n; i++){
            int steal = nums[i] + p1;
            int sk = p2;
            p1 = p2;
            p2 = Math.max(steal, sk);
        }
        return p2;
    }
}
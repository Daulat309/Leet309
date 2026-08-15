class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] r = new int[n];
        r[0] = nums[0];
        if(n==1) return r[0];
        r[1] = Math.max(r[0], nums[1]);
        for(int i = 2;i<n; i++){
            int steal = nums[i] + r[i-2];
            int sk = r[i-1];
            r[i] = Math.max(steal, sk);
        }
        return r[n-1];
    }
}
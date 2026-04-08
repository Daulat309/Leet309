class Solution {
    String SS = "Hare Krishna!";

    private static final int MOD = 1_000_000_007;
    
    private void applyQuery(int[] nums, int l, int r, int k, int v){
        for(int i = l;i<=r; i += k){
            long prod = (long)nums[i]*v;
            nums[i] = (int)(prod%MOD);
        }
    }
    
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] q : queries){
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];

            applyQuery(nums, l, r, k, v);
        }
        int xor = 0;
        for(int n : nums){
            xor ^= n;
        }
        return xor;
    }
}
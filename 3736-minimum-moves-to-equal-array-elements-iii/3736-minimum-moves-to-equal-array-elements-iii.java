class Solution {
    public int minMoves(int[] nums) {
        //int mx = Arrays.stream(nums).max().orElse(0);
        int mx = Integer.MIN_VALUE;
        int res = 0;
        for(int num : nums){
            mx = Math.max(mx, num);
        }
        for(int num : nums){
            res += mx - num;
        }
        return res;
    }
}
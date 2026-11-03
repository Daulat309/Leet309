class Solution {
    public int minMoves(int[] nums) {
        int sm = 0;
        int mx = Integer.MIN_VALUE;
        for(int num : nums){
            mx = Math.max(mx, num);
            sm += num;
        }

        return mx*nums.length-sm;

    }
}
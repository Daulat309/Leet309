class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int n : nums) sum += n;
        return Math.min(sum%k,sum);
    }
}
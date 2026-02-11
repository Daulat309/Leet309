class Solution {
    public long maximumScore(int[] nums) {
        long sum = 0;
        long max = Long.MIN_VALUE;
        for(int i = 0;i<nums.length;i++) sum += nums[i];
        long smin = nums[nums.length-1];
        sum -= nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            long sc = sum - smin;
            if(sc>max) max = sc;
            sum -= nums[i];
            if(nums[i]<smin) smin = nums[i];
        }
        return max;
    }
}
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, streak = 0;
        for (int num : nums) {
            if(num == 0)cnt += ++streak;
            else streak  = 0;
        }
        return cnt;
    }
}

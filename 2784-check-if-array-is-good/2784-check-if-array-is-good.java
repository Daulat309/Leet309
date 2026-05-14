class Solution {
    public boolean isGood(int[] nums) {

        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);

            if (nums[i] == n - 1) {
                cnt++;
            }
        }

        int expected = (n - 1) * n / 2 + (n - 1);

        return sum == expected &&
               min == 1 &&
               max == n - 1 &&
               cnt == 2;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[] dp = new int[n];
        int[] minPrice = new int[n];

        minPrice[0] = prices[0];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            minPrice[i] = Math.min(minPrice[i - 1], prices[i]);

            dp[i] = Math.max(
                dp[i - 1],
                prices[i] - minPrice[i]
            );
        }

        return dp[n - 1];
    }
}
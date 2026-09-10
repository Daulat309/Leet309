class Solution {
    boolean[][] ispl;

    public int minCut(String s) {
        int n = s.length();

        if (n <= 1) return 0;

        ispl = new boolean[n][n];

        // Precompute palindromes in O(n^2)
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) &&
                    (j - i <= 2 || ispl[i + 1][j - 1])) {
                    ispl[i][j] = true;
                }
            }
        }
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = i;

            for (int j = 0; j <= i; j++) {
                if (ispl[j][i]) {
                    if (j == 0) {
                        dp[i] = 0;
                    } else {
                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                    }
                }
            }
        }

        return dp[n - 1];
    }
}
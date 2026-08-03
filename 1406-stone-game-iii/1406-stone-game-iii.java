class Solution {
    public String stoneGameIII(int[] arr) {
        int dp[] = new int[arr.length+1];
        for (int i = arr.length - 1; i >= 0; i--) {
            dp[i] = Integer.MIN_VALUE;
            int cur = 0;
            for (int k = 0 ; k < 3 && i + k < arr.length; k++) {
                cur += arr[i + k];
                dp[i] = Math.max(dp[i], cur - dp[i + k + 1]);
            }
            System.out.println(dp[i]);
        }
        
        return dp[0]>0? "Alice" : dp[0]<0? "Bob" : "Tie";
    }
}
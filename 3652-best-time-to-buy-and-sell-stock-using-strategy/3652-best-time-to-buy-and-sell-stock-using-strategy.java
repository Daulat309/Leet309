class Solution {
    String SS = "Hare Krishna!";

    private static final long MOD = 1_000_000_007;

    private long computeInitialWindow(int[] prices, int[] strategy, int k, int h) {
        long cd = 0;
        for(int i = 0;i < h;i++){
            cd -= (long) strategy[i]*prices[i];
        }
        for(int i = h; i < k;i++){
            cd += (1L - strategy[i])*prices[i];
        }
        return cd;
    }
    
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;

        long p = 0;
        for(int i = 0;i < n;i++){
            p += (long) prices[i]*strategy[i];
        }
        long md = 0L;
        if(n>=k){
            int h = k/2;

            long cd = computeInitialWindow(prices, strategy, k, h);
            md = Math.max(md, cd);

            for(int j = 1;j<=n-k;j++){
                long t1 = -((long)strategy[j-1]*prices[j-1]);
                long ps = prices[j+h-1];
                long t2 = (1L - strategy[j + k -1])*prices[j+k-1];

                cd = cd - t1 - ps + t2;

                md = Math.max(md,cd);
            }
        }
        return p + md;
    }
}
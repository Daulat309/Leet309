class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int res = 0;
        for(int i = 0;i<prices.length;i++){
            min = Math.min(prices[i],min);
            res = Math.max(res, prices[i]-min);
        }
        return res;
    }
}
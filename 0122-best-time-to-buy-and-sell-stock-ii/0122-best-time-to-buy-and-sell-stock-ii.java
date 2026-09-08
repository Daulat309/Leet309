class Solution {
    public int maxProfit(int[] prices) {
        //int b = prices[0];
        int res = 0;
        int n = prices.length;
        for(int i = 1;i<n;i++){
            if(prices[i]>prices[i-1]){
                res += prices[i]-prices[i-1];
            }
            //b = prices[i];
        }
        return res;
    }
}
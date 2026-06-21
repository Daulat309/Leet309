class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt = 0;
        for(int i = 0;i<costs.length&&coins>=0;i++){
            coins -= costs[i];
            if(coins>=0) cnt++;
        }
        return cnt;
    }
}
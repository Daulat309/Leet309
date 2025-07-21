class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i : prices){
            if(i<min){
                min = i;
            }
            if(i-min>max){
                max = i-min;
            }
        }
        return max;
    }
}
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int s = 0;
        int i = cost.length-1;
        for(i = cost.length-1;i>0;i -= 3){
            s += cost[i];
            s += cost[i-1];
        }
        if(i==0) s+= cost[0];
        return s;
    }
}
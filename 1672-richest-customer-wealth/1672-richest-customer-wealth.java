class Solution {
    public int maximumWealth(int[][] acc) {
        int max = 0;
        for(int i = 0;i<acc.length;i++){
            for(int j = 1;j<acc[i].length;j++) acc[i][0] += acc[i][j];
            if(acc[i][0]>max) max = acc[i][0];
        }
        return max;
    }
}
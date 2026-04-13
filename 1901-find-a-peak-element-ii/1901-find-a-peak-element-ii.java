class Solution {
    public int[] findPeakGrid(int[][] mat) {
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                int cur = mat[i][j];
                int l = j==0?-1:mat[i][j-1];
                int r = j==mat[i].length-1?-1:mat[i][j+1];
                int u = i==0?-1:mat[i-1][j];
                int d = i==mat.length-1?-1:mat[i+1][j];
                if(cur>l&&cur>r&&cur>u&&cur>d) return new int[]{i,j};
            }
        }
        return new int[]{0,0};
    }
}
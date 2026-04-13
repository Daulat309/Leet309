class Solution {
    public int[] findPeakGrid(int[][] a) {
        int m = a.length, n = a[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if((i-1<0||a[i-1][j]<a[i][j])&&(i+1>=a.length||a[i+1][j]<a[i][j])&&(j-1<0||a[i][j-1]<a[i][j])&&(j+1>=n||a[i][j+1]<a[i][j])) return new int[]{i,j};
            }
        }
        return new int[]{0,0};
    }
}
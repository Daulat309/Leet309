class Solution {
    public int oddCells(int m, int n, int[][] ind) {
        int[][] ar = new int[m][n];
        for(int i = 0;i<ind.length;i++){
            int k = ind[i][0];
            int l = ind[i][1];
            for(int j = 0;j<n;j++) ar[k][j]++;
            for(int j = 0;j<m;j++) ar[j][l]++;
        }
        int cnt = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(ar[i][j]%2!=0) cnt++;
            }
        }
        return cnt;
    }
}
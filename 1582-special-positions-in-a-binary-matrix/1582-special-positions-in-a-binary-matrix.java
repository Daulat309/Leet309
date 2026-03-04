class Solution {
    public int numSpecial(int[][] mat) {
        int cnt = 0;
        for(int i = 0;i<mat.length;i++){
            mn:for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    for(int k = 0;k<mat[i].length;k++){
                        if(k==j) continue;
                        if(mat[i][k]==1) break mn;
                    }
                    for(int k = 0;k<mat.length;k++){
                        if(i==k) continue;
                        if(mat[k][j]==1) break mn;
                    }
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
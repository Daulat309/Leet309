class Solution {
    public void setZeroes(int[][] ar) {
        int[][] arr = new int[ar.length][ar[0].length];
        for(int i = 0;i<ar.length;i++){
            for(int j = 0;j<ar[i].length;j++)if(ar[i][j]==0) arr[i][j] = 1;
        }
        for(int i = 0;i<ar.length;i++){
            for(int j = 0;j<ar[i].length;j++)if(arr[i][j]==1) setZ(ar,i,j);
        }
    }

    public void setZ(int[][] ar, int r, int c){
        for(int i = 0;i<ar.length;i++) ar[i][c] = 0;
        for(int j = 0;j<ar[0].length;j++) ar[r][j] = 0;
    }
}
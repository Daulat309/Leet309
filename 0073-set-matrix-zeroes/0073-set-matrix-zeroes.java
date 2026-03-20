class Solution {
    public void setZeroes(int[][] ar) {
        int[] rw = new int[ar.length];
        int[] cl = new int[ar[0].length];
        for(int i = 0;i<ar.length;i++){
            for(int j = 0;j<ar[i].length;j++)if(ar[i][j]==0){
                rw[i] = 1;
                cl[j] = 1;
            }
        }
        for(int i = 0;i<rw.length;i++){
            if(rw[i]==1) setrZ(ar,i);
        }
        for(int i = 0;i<cl.length;i++){
            if(cl[i]==1) setcZ(ar,i);
        }
    }

    public void setrZ(int[][] ar, int r){
        for(int j = 0;j<ar[0].length;j++) ar[r][j] = 0;
    }
    public void setcZ(int[][] ar,int c){
        for(int i = 0;i<ar.length;i++) ar[i][c] = 0;
    }
}
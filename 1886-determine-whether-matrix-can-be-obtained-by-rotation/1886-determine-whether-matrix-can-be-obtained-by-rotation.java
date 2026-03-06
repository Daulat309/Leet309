class Solution {
    public boolean findRotation(int[][] m, int[][] t) {
        int[][] k = m;
        for(int l = 0;l<4;l++){
            boolean isit = true;
            outer:for(int i = 0;i<m.length;i++){
                for(int j = 0;j<m.length;j++){
                    if(k[i][j] != t[i][j]){
                        isit = false;
                        break outer;
                    }
                }
            }
            if(isit) return true;
            k = rot(k);
        }
        return false;
    }

    public int[][] rot(int[][] m){
        int[][] t = new int[m.length][m.length];
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m.length;j++){
                t[i][j] = m[m.length-1-j][i];
            }
        }
        return t;
    }
}
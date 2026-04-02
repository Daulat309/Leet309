class Solution {
    public int[][] matrixReshape(int[][] m, int r, int c) {
        int[] a = new int[m.length*m[0].length];
        int k = 0;
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[0].length;j++) a[k++] = m[i][j];
        }
        if(r*c!=m.length*m[0].length) return m;
        k = 0;
        int[][] b = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++) b[i][j] = a[k++];
        }
        return b;
    }
}
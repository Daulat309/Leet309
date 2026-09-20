class Solution {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        for(int[] a : m){
            Arrays.fill(a,-1);
        }

        int f = 1, x = 0, dx = 0, y = 0, dy = 1;

        for(int i = 0;i<n*n;i++){
            m[x][y] = f;
            f++;

            if(!(0<=x+dx&&0<=y+dy&&y+dy<n&&x+dx<n)||m[x+dx][y+dy]!=-1){
                int temp = dy;
                dy = -dx;
                dx = temp;
            }

            x += dx;
            y += dy;
        }
        return m;
    }
}
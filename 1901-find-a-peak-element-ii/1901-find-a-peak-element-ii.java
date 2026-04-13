class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l = 0, h = mat[0].length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            int mr = findMax(mat,m);
            if(m==0&&(m==mat[0].length-1||mat[mr][m]>mat[mr][m+1])) return new int[]{mr,m};
            if(m==mat[0].length-1&&(m==0||mat[mr][m]>mat[mr][m-1])) return new int[]{mr,m};
            if((m-1>=0&&mat[mr][m]>mat[mr][m-1])&&((m+1<mat[0].length&&mat[mr][m]>mat[mr][m+1]))) return new int[]{mr,m};
            if((m-1>=0&&mat[mr][m]<mat[mr][m-1])) h = m - 1;
            else l = m + 1;
        }
        return new int[]{0,0};
    }

    public int findMax(int[][] mat, int mid){
        int l = 0, r = mat.length-1, mx = Integer.MIN_VALUE,mr = 0;
        while(l<=r){
            if(mat[l][mid]>mx){
                mx = mat[l][mid];
                mr = l;
            }
            if(mat[r][mid]>mx){
                mx = mat[r][mid];
                mr = r;
            }
            l++;
            r--;
        }
        return mr;
    }
}
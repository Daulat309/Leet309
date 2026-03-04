class Solution {
    public int oddCells(int m, int n, int[][] ind) {
        int cnt = 0;
        int[] r = new int[m];
        int[] c = new int[n];
        for(int i =0 ;i<ind.length;i++){
                r[ind[i][0]]++;
                c[ind[i][1]]++;
                r[ind[i][0]] %= 2;
                c[ind[i][1]] %= 2;
        }
        int ccnt = 0;
        for(int i = 0;i<c.length;i++) if(c[i]==1) ccnt++;
        for(int i = 0;i<r.length;i++){
            if(r[i]==0) cnt += ccnt;
            else cnt += n-ccnt;
        }
        return cnt;
    }
}
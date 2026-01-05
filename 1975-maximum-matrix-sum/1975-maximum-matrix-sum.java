class Solution {
    public long maxMatrixSum(int[][] m) {
        long sum = 0;
        // int nmax = -100001;
        int count = 0;
        int abs = 100001;
        boolean isz = false;
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                if(m[i][j]==0) isz = true;
                abs = Math.min(Math.abs(m[i][j]),abs);
                if(m[i][j]<0){
                    // nmax = Math.max(m[i][j],nmax);
                    sum += m[i][j]*(-1);
                    count++;
                }
                else sum += m[i][j];
            }
        }
        if(isz) return sum;
        if(count%2==0) return sum;
        return sum - (2*(abs));
    }
}
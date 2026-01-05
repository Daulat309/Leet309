class Solution {
    public long maxMatrixSum(int[][] m) {
        long sum = 0;
        int count = 0;
        int abs = 100001;
        int n = m.length;
        int mm = m[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<mm;j++){
                abs = Math.min(Math.abs(m[i][j]),abs);
                if(m[i][j]<0){
                    sum += m[i][j]*(-1);
                    count++;
                }
                else sum += m[i][j];
            }
        }
        if(count%2==0) return sum;
        return sum - (2*(abs));
    }
}
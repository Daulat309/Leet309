class Solution {
    public boolean searchMatrix(int[][] a, int x) {
        for(int i = 0;i<a.length;i++){
            int l = 0, h = a[0].length-1;
            if ((a[i][l] <= x) && (x <= a[i][h])){
                while(l<=h){
                    int m = l + (h-l)/2;
                    if(a[i][m]==x) return true;
                    if(a[i][m]>x) h = m-1;
                    else l = m + 1;
                }
            }
        }
        return false;
    }
}
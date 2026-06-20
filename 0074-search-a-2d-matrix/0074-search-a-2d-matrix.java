class Solution {
    public boolean searchMatrix(int[][] a, int x) {
        int l = 0, h = a.length*a[0].length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            int i = m/a[0].length;
            int j = m%a[0].length;
            if(a[i][j]==x) return true;
            if(a[i][j]>x){
                h = m-1;
            }
            else l = m + 1;
        }
        return false;
    }
}
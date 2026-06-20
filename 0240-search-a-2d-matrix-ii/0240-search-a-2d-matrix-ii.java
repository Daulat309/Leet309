class Solution {
    public boolean searchMatrix(int[][] a, int x) {

        int r = 0, c = a[0].length-1;
        while(r<a.length&&c>=0){
            if(a[r][c]==x) return true;
            if(a[r][c]>x) c--;
            else r++;
        }
        return false;
    }
}
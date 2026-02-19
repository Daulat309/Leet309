class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int m = mat.length;
        int n = mat[0].length;

        int l = 0;
        int h = m * n - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            int r = mid / n;
            int c = mid % n;

            if (mat[r][c] == x) return true;
            
            if (mat[r][c] < x) l = mid + 1;
            else h = mid - 1;
        }
        return false;
    }
}

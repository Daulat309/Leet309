class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] arr = new int[m * n];
        int k = 0;
        
        int rem = grid[0][0] % x;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] % x != rem) return -1;
                arr[k++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int md = arr[arr.length / 2];
        int res = 0;
        for (int val : arr) {
            res += Math.abs(val - md) / x;
        }
        return res;
    }
}
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        int xor = 0;

        // XOR all numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            xor ^= i;
        }

        // XOR all numbers in grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                xor ^= grid[i][j];
            }
        }

        // xor = a ^ b
        int bit = xor & -xor;

        int x = 0;
        int y = 0;

        // Divide 1..N into two groups
        for (int i = 1; i <= N; i++) {
            if ((i & bit) != 0)
                x ^= i;
            else
                y ^= i;
        }

        // Divide grid elements into two groups
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((grid[i][j] & bit) != 0)
                    x ^= grid[i][j];
                else
                    y ^= grid[i][j];
            }
        }

        // One is repeating, the other is missing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == x) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[]{y, x};
    }
}
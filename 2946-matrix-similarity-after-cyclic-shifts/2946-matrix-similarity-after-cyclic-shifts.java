class Solution {
    public boolean areSimilar(int[][] a, int k) {
        int n = a.length, m = a[0].length;
        k %= m;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int idx;
                if ((i & 1) == 0) {
                    idx = (j + k) % m;
                } else {
                    idx = (j - k + m) % m;
                }
                if (a[i][j] != a[i][idx]) return false;
            }
        }
        return true;
    }
}
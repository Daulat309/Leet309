import java.util.*;

class Solution {
    int res = Integer.MAX_VALUE;
    Set<String> visited;

    public int minCost(int[][] grid) {
        res = Integer.MAX_VALUE;
        visited = new HashSet<>();
        bfs(0, 0, grid, 0);
        return res;
    }

    public void bfs(int i, int j, int[][] g, int p) {
        if (i >= g.length || j >= g[0].length) return;

        p ^= g[i][j];

        String key = i + "," + j + "," + p;
        if (!visited.add(key)) return;

        if (i == g.length - 1 && j == g[0].length - 1) {
            res = Math.min(res, p);
            return;
        }

        bfs(i + 1, j, g, p);
        bfs(i, j + 1, g, p);
    }
}
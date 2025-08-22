class Solution {
    public int minimumArea(int[][] grid) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    x.add(j);
                    y.add(i);
                }
            }
        }

        Collections.sort(x);
        Collections.sort(y);

        return (x.get(x.size() - 1) - x.get(0) + 1) *
               (y.get(y.size() - 1) - y.get(0) + 1);
    }
}
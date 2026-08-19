class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {

        Arrays.sort(rs, (a, b) -> Integer.compare(a[0], b[0]));

        int cnt = 0;
        int i = 0;
        int prevRow = 0;

        while (i < rs.length) {

            int row = rs[i][0];

            // Rows between prevRow and current row are empty
            cnt += (row - prevRow - 1) * 2;

            HashSet<Integer> set = new HashSet<>();

            while (i < rs.length && rs[i][0] == row) {
                set.add(rs[i][1]);
                i++;
            }

            boolean left = !set.contains(2) &&
                           !set.contains(3) &&
                           !set.contains(4) &&
                           !set.contains(5);

            boolean middle = !set.contains(4) &&
                             !set.contains(5) &&
                             !set.contains(6) &&
                             !set.contains(7);

            boolean right = !set.contains(6) &&
                            !set.contains(7) &&
                            !set.contains(8) &&
                            !set.contains(9);

            if (left && right) {
                cnt += 2;
            } 
            else if (left || middle || right) {
                cnt++;
            }

            prevRow = row;
        }

        // Rows after the last reserved row
        cnt += (n - prevRow) * 2;

        return cnt;
    }
}
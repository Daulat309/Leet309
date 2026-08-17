class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int total = m + n;
        int mid = total / 2;

        if (m == 0) {
            return total % 2 == 0
                    ? ((double) b[mid - 1] + b[mid]) / 2
                    : b[mid];
        }

        if (n == 0) {
            return total % 2 == 0
                    ? ((double) a[mid - 1] + a[mid]) / 2
                    : a[mid];
        }

        int x = 0, y = n;

        while (x + y > mid) y--;
        while (x + y < mid) x++;

        while (true) {
            int left = Integer.MIN_VALUE;
            int right = Integer.MAX_VALUE;

            if (x > 0) left = Math.max(left, a[x - 1]);
            if (y > 0) left = Math.max(left, b[y - 1]);

            if (x < m) right = Math.min(right, a[x]);
            if (y < n) right = Math.min(right, b[y]);

            if (left <= right) {
                if (total % 2 == 0)
                    return ((double) left + right) / 2.0;

                return right;
            }

            x++;
            y--;
        }
    }
}
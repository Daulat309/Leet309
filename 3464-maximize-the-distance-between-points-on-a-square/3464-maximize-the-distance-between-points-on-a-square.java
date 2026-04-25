import java.util.*;

class Solution {
    public int maxDistance(int side, int[][] points, int k) {
        int n = points.length;
        long per = 4L * side;
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            int x = points[i][0];
            int y = points[i][1];
            if (y == 0) arr[i] = x;
            else if (x == side) arr[i] = side + y;
            else if (y == side) arr[i] = 3L * side - x;
            else arr[i] = 4L * side - y;
        }

        Arrays.sort(arr);

        long[] ext = new long[2 * n];
        for (int i = 0; i < n; i++) {
            ext[i] = arr[i];
            ext[i + n] = arr[i] + per;
        }

        long low = 0, high = 2L * side, ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (canPlace(ext, n, k, mid, per)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) ans;
    }

    private boolean canPlace(long[] arr, int n, int k, long dist, long per) {
        for (int start = 0; start < n; start++) {
            int count = 1;
            long last = arr[start];
            int idx = start;

            while (count < k) {
                int next = lowerBound(arr, idx + 1, start + n, last + dist);
                if (next == start + n) break;
                count++;
                last = arr[next];
                idx = next;
            }

            if (count == k && arr[start] + per - last >= dist)
                return true;
        }
        return false;
    }

    private int lowerBound(long[] arr, int left, int right, long target) {
        int l = left, r = right;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}
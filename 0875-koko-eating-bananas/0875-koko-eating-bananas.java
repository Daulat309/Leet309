class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int l = 1, r = max;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1L) / mid;
            }

            if (hours <= h) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}